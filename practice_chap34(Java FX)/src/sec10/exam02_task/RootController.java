package sec10.exam02_task;

import java.net.URL;
import java.util.ResourceBundle;

import org.w3c.dom.events.EventException;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable{

	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Button btnStart,btnStop;
	
	private Task<Void> task;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�̺�Ʈ ó���κ�
		
		btnStart.setOnAction(e->{
			handleBtnStart(e);
		});
		
		btnStop.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtnStop(event);
				
			}
		});
		
	}
	
	//�̺�Ʈ ó�� �޼���
	
	public void handleBtnStart(ActionEvent event) {
		//������� ���� Task����, Task�� call()�߻�޼��带 �������־�
		//�����Ǹ� �ؾ��Ѵ�.
		task = new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				for(int i=0; i<=100; i++) {
					//��Ұ� �Ǿ����� ��� ������
					if(this.isCancelled()) {
						this.updateMessage("��ҵ�");
						break;
					}
					//updateProgress()�� progressBar�� progressindicator���� ���ѵǾ� �ִ�.
					this.updateProgress(i, 100); //i�� ���ప, 100�� �Ϸᰪ
					//�۾��� �Ϸ�Ǹ�, i���� lblWorkDone�� �ѷ��ش�.
					this.updateMessage(String.valueOf(i));
					
					//call()���� ����ó���� �Ǿ��ִ�. ������ ������ �ܺο��� interrupt()�� ȣ���ϸ� task�� ��ҵǵ���
					//���� ���ܱ��� ���
					try {
					Thread.sleep(100);
					} catch(InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("��ҵ�");
							break;
						}
					}
				}
				return null;
			}
		};
		
		//�Ӽ����ε� �ڵ�
		//ProgressBar��Ʈ���� �Ӽ��� task�� updateProgress�� progress�Ӽ��� ���ε�
		//�̷��� ���ָ� ProgressBar�� ���������� ���� ���ϰ� �ȴ�.
		//�ֳ��ϸ� task�� i���� ��� ���ϱ� �����̴�.
		progressBar.progressProperty().bind(task.progressProperty());
		//���� ���� Label��Ʈ���� �Ӽ��� updateMesaage()�� �ۼ��� ���ε�
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		//������ ���� �Ű������� task�� �־���.
		//�ռ� ��������� task�� runnable�������̽��� �����߱⶧���� �Ű������� ���� ����
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent event) {
		//'����'��ư�� Ŭ���ϸ� task�� ��Ҹ޼��� cancel()�� ȣ���Ͽ�, task�� ��ҽ�Ų��.
		task.cancel();
	}
	
	
	
}
