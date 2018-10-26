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
		//이벤트 처리 부분
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
					
					//작업스레드가 직접 UI를 변경하는 코드가 들어가면 예외가 발생하는 것을 확인할 수 있다.
					//LblTime.setText(strTime);
					
					//작업스레드가 계속적으로 시스템으로부터 시간을 얻어오고 그것을 이벤트 큐에 저장을
					// 해주면 JavaFxApplication Thread가 그 이벤트를 가져와서 Platform.runLater()를 
					//실행한다. 하여, UI를 변경하는데 별 문제가 없는것이다.
					
					//람다식
					Platform.runLater(()->{
						LblTime.setText(strTime);
					});
					
					//직접 익명구현 객체 생성
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
		//데몬 설정
		thread.setDaemon(true);
		
		thread.start();
		
	}
	
	
	public void handleBtnStop(ActionEvent e) {
		stop=true;
		//platform.exit();
	}
}
