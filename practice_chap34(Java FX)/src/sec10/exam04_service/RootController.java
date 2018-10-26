package sec10.exam04_service;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable{

	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone, lblResult;
	@FXML private Button btnStart,btnStop;
	
	private Timeservice timeService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�̺�Ʈ ó���κ�
		
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
		timeService = new Timeservice();
		
		
		//���α׷����۽� �ٷν����ϰԲ� �ߴ�.
		//start()�� restart()�� ȣ��Ǹ� �ڵ� createTask()�� ȣ������ �������.
		timeService.start();
		
	}
	
	public void handleBtnStart(ActionEvent event) {
		
		timeService.restart();
		lblResult.setText("");
		
	}
	
	public void handleBtnStop(ActionEvent event) {
		
		timeService.cancel();
	}
	
	//��øũ���� Timeservice
	
	class Timeservice extends Service<Integer>{

		@Override
		protected Task<Integer> createTask() {
			//Serivce�� ���� Task��ü ����.
			Task<Integer> task = new Task<Integer>() {

				@Override
				protected Integer call() throws Exception {
					int result = 0;
					for(int i=0; i<=100; i++) {
						//cancel�Ǿ����� �˻�
						if(this.isCancelled()) {break;}
						result +=i;
						
						//progressBar����
						updateProgress(i, 100);
						//Label����
						updateMessage(String.valueOf(i));
						
						//�Ͻ�����
						try {
							Thread.sleep(100);
						}
						catch(InterruptedException e) {
							if(this.cancel()) {break;}
						}
					}
					return result;
				}
			};
			
			//�Ӽ����ε�
			progressBar.progressProperty().bind(task.progressProperty());
			lblWorkDone.textProperty().bind(task.messageProperty());
			return task;
		}
		
			//Serivce��ü�� �Ʒ� 3���� �ݹ� �޼��� ������
			//������ �ڵ�����
		@Override
		protected void succeeded() {
			System.out.println("����");
			lblResult.setText(String.valueOf(this.getValue())); //����� UI����
		}
		//��ҵǾ����� �ڵ�����
		@Override
		protected void cancelled() {
			System.out.println("���");
			lblResult.setText("��ҵ�");
		}
		
		//���ܰ� �߻������� �ڵ�����
		@Override
		protected void failed() {
			System.out.println("����");
			lblResult.setText("���ܹ߻���");
		}
		
	}
	
}
