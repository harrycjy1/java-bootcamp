package sec10.exam03_task_callback;

import java.net.URL;
import java.util.ResourceBundle;

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
	
	private Task<Integer> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�̺�Ʈ ó���κ�
		
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
		
	}
	
	public void handleBtnStart(ActionEvent event) {
		
		task = new Task<Integer>() {

			@Override
			protected Integer call() throws Exception {
				int result =0;
				
				for(int i =0; i<=100; i++) {
					if(this.isCancelled()) {
						this.updateMessage("��ҵ�");
						break;
					}
					result +=i; //����
					//updateProgress()�� ProgressBar�� progressindicator���� ���ѵǾ�����
					this.updateProgress(i, 100);
					//�۾��� �Ϸ�Ǹ�. i���� lblWorkDone�� �ѷ��ش�.
					this.updateMessage(String.valueOf(i));
					//call()���� ����ó���� �Ǿ��ִ� ������ ������ �ܺο��� interrupt�� ȣ���ϸ� task�� ��ҵǵ���
					//���ܱ����� �־���.
					
					try{
						Thread.sleep(100);
						}
					catch(InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("��ҵ�");
							break;
						}
					}
				}
				return result;
			}
			
			//���������� �ڵ������ϴ� succeded()������
			//�Ʒ� 3���� �޼���� JavaFX Application Thread�� �����ϹǷ� �󸶵��� UI�����ڵ带 ������ �ִ�.
			@Override
			protected void succeeded() {
				System.out.println("����");
				lblResult.setText(String.valueOf(task.getValue())); //����� UI����
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
		};
		
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		//������ϰԵɶ� ����ǰԲ� ���ڿ� ��
		lblResult.setText("");
		
		//������ ���� �Ű������� task��(runnable�������̽� �����߱⶧���� ������)
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent event) {
		//���� ��ư�� Ŭ���ϸ� task�� ��Ҹ޼����� cancel()�� ȣ���Ͽ�, task�� ��ҽ�Ų��.
		task.cancel();
	}
	
	
}
