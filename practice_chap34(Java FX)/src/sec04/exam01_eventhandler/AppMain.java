package sec04.exam01_eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Button btn1 = new Button();
		btn1.setText("버튼1");
		Button btn2 = new Button();
		btn2.setText("버튼2");
		
		root.getChildren().addAll(btn1,btn2);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//이벤트 처리부분 등록
		/*버튼에서 ACtion이벤트가 바새앟면 이를 처리해줄 핸들러를 버튼에 등록을 해준다.
		이것을 위임형 방식이라고 했다. 그럼 이 EventHandler는 제네릭인터페이스이면서,
		아울러 함수적 인터페이스다. 즉, handle()메서드를 하나만 가지고 있다. 하여 이
		handle()메서드를 구현해주면 버튼에서 이벤트가 발생하고 그것을 handle()내에 있는
		코드가 실행되는 것이다*/
		
		/*btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼 1 클릭");
				
			}
		});*/
		
		
		//람다식으로 작성하면 코드가 준다
		btn1.setOnAction(event -> System.out.println("람다식으로 구현되어진 버튼 1 클릭"));
		
		btn2.setOnAction(event -> {System.out.println("람다식으로 구현되어진 버튼 2 클릭");});
		
		primaryStage.setOnCloseRequest(event -> {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("정말 종료 하겠습니까?");
			alert.show();
		});
		
	}

}
