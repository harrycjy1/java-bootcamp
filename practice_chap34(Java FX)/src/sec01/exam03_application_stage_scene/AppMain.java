package sec01.exam03_application_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//VBox�� ���Ϳ��� Ŭ������ �� �����̸� �������� ����(��Ʈ��)���� ��ġ�ϴ� �����̳��̴�(Parent�� ��ӹ޴´�)
		VBox root = new VBox();
		root.setPrefWidth(500);
		root.setPrefHeight(350);
		root.setAlignment(Pos.CENTER); //�߾�����
		root.setSpacing(20);		//��ġ�Ǵ� ��Ʈ���� ������ 20�ȼ��� �ϰڴٴ� �ڵ�
		
		Label label = new Label();
		label.setText("�ȳ� �ڹ�");
		label.setFont(new Font(20));
		
		Button button = new Button();
		button.setText("Ȯ��");
		
		
		//���ٽ����� ��ư�� Ŭ���� ����ǵ��� �̺�Ʈ ������ ������ �߰���
		button.setOnAction(event -> {
			System.out.println("�÷��� ����");
			Platform.exit();
			}
		);
		
		
		/*button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			Platform.exit();
			}
		});*/
		
		//VBox(��Ʈ�����̳�)�� ��Ʈ�ѵ��� ��ġ�Ѵ�
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		//Scene�� �������� �Ű����� Parent��� �߻�Ŭ�����̴�
		//�Ͽ� ��ӹ޴� ����Ŭ���� ��� �����̳� Ŭ�������̴�.
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show(); //������ �����ֱ�
		/*
		    �� ������ ����
		  1. ���� Stage�� �����°� �� ������â�� �ش�
		  2. �� Stage�� �����Ǹ� ���, �� Scene�� �������ش�.
		  3. �׸��� Scene�� ������ �� �Ű����� ��� ParentŬ������ ���µ�,
		  	  �߻�Ŭ�����̹Ƿ� ���� �����̳� Ŭ������ �Ѱ��ش�.
		  4. ParentŬ������ ��ӹ޴� �����̳ʿ� ���� ��Ʈ���� �߰���ġ
		*/
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}


}
