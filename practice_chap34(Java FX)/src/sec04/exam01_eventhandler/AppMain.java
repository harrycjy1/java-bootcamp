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
		btn1.setText("��ư1");
		Button btn2 = new Button();
		btn2.setText("��ư2");
		
		root.getChildren().addAll(btn1,btn2);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//�̺�Ʈ ó���κ� ���
		/*��ư���� ACtion�̺�Ʈ�� �ٻ��۸� �̸� ó������ �ڵ鷯�� ��ư�� ����� ���ش�.
		�̰��� ������ ����̶�� �ߴ�. �׷� �� EventHandler�� ���׸��������̽��̸鼭,
		�ƿ﷯ �Լ��� �������̽���. ��, handle()�޼��带 �ϳ��� ������ �ִ�. �Ͽ� ��
		handle()�޼��带 �������ָ� ��ư���� �̺�Ʈ�� �߻��ϰ� �װ��� handle()���� �ִ�
		�ڵ尡 ����Ǵ� ���̴�*/
		
		/*btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("��ư 1 Ŭ��");
				
			}
		});*/
		
		
		//���ٽ����� �ۼ��ϸ� �ڵ尡 �ش�
		btn1.setOnAction(event -> System.out.println("���ٽ����� �����Ǿ��� ��ư 1 Ŭ��"));
		
		btn2.setOnAction(event -> {System.out.println("���ٽ����� �����Ǿ��� ��ư 2 Ŭ��");});
		
		primaryStage.setOnCloseRequest(event -> {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("���� ���� �ϰڽ��ϱ�?");
			alert.show();
		});
		
	}

}
