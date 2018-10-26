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
		//이벤트 처리부분
		
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
		timeService = new Timeservice();
		
		
		//프로그램시작시 바로실행하게끔 했다.
		//start()나 restart()가 호출되면 자동 createTask()를 호출함을 기억하자.
		timeService.start();
		
	}
	
	public void handleBtnStart(ActionEvent event) {
		
		timeService.restart();
		lblResult.setText("");
		
	}
	
	public void handleBtnStop(ActionEvent event) {
		
		timeService.cancel();
	}
	
	//중첩크래스 Timeservice
	
	class Timeservice extends Service<Integer>{

		@Override
		protected Task<Integer> createTask() {
			//Serivce에 사용될 Task객체 만듬.
			Task<Integer> task = new Task<Integer>() {

				@Override
				protected Integer call() throws Exception {
					int result = 0;
					for(int i=0; i<=100; i++) {
						//cancel되었는지 검사
						if(this.isCancelled()) {break;}
						result +=i;
						
						//progressBar갱신
						updateProgress(i, 100);
						//Label갱신
						updateMessage(String.valueOf(i));
						
						//일시정지
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
			
			//속성바인딩
			progressBar.progressProperty().bind(task.progressProperty());
			lblWorkDone.textProperty().bind(task.messageProperty());
			return task;
		}
		
			//Serivce객체의 아래 3개의 콜백 메서드 재정의
			//성공시 자동실행
		@Override
		protected void succeeded() {
			System.out.println("성공");
			lblResult.setText(String.valueOf(this.getValue())); //결과값 UI변경
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
		
	}
	
}
