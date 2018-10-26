package sec10.exam01_runlater;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable{
		
	@FXML private Label LblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private boolean stop; // flag

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�̺�Ʈ ó�� �κ�
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(e->handleBtnStop(e));
		
	}
	
	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					String strTime = sdf.format(new Date());
					
					//�۾������尡 ���� UI�� �����ϴ� �ڵ尡 ���� ���ܰ� �߻��ϴ� ���� Ȯ���� �� �ִ�.
					//LblTime.setText(strTime);
					
					//�۾������尡 ��������� �ý������κ��� �ð��� ������ �װ��� �̺�Ʈ ť�� ������
					// ���ָ� JavaFxApplication Thread�� �� �̺�Ʈ�� �����ͼ� Platform.runLater()�� 
					//�����Ѵ�. �Ͽ�, UI�� �����ϴµ� �� ������ ���°��̴�.
					
					//���ٽ�
					Platform.runLater(()->{
						LblTime.setText(strTime);
					});
					
					//���� �͸��� ��ü ����
					/*Platform.runLater(new Runnable() {
						
						@Override
						public void run() {
							LblTime.setText(strTime);
							
						}
					});*/
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
						
					
					
				}
			};
		};
		//���� ����
		thread.setDaemon(true);
		
		thread.start();
		
	}
	
	
	public void handleBtnStop(ActionEvent e) {
		stop=true;
		//platform.exit();
	}
}
