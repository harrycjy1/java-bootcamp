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
		//이벤트 처리부분
		
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
						this.updateMessage("취소됨");
						break;
					}
					result +=i; //누적
					//updateProgress()는 ProgressBar나 progressindicator에만 국한되어있음
					this.updateProgress(i, 100);
					//작업이 완료되면. i값을 lblWorkDone에 뿌려준다.
					this.updateMessage(String.valueOf(i));
					//call()에는 예외처리가 되어있다 하지만 지금은 외부에서 interrupt를 호출하면 task가 취소되도록
					//예외구문을 넣었다.
					
					try{
						Thread.sleep(100);
						}
					catch(InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("취소됨");
							break;
						}
					}
				}
				return result;
			}
			
			//성공했을때 자동실행하는 succeded()재정의
			//아래 3개의 메서드는 JavaFX Application Thread가 실행하므로 얼마든지 UI변경코드를 넣을수 있다.
			@Override
			protected void succeeded() {
				System.out.println("성공");
				lblResult.setText(String.valueOf(task.getValue())); //결과값 UI변경
			}
			//취소되었을때 자동실행
			@Override
			protected void cancelled() {
				System.out.println("취소");
				lblResult.setText("취소됨");
			}
			
			//예외가 발생했을때 자동실행
			@Override
			protected void failed() {
				System.out.println("예외");
				lblResult.setText("예외발생함");
			}
		};
		
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		//재시작하게될때 적용되게끔 빈문자열 줌
		lblResult.setText("");
		
		//스레드 생성 매개값으로 task줌(runnable인터페이스 구현했기때문에 가능함)
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent event) {
		//멈춤 버튼을 클릭하면 task를 취소메서드인 cancel()을 호출하여, task를 취소시킨다.
		task.cancel();
	}
	
	
}
