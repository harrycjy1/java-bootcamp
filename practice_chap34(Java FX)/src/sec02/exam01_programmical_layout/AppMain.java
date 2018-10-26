package sec02.exam01_programmical_layout;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	// �����̳� ������ ���� ��Ʈ�ѵ��� �ڹ��ڵ�� ����
	//(���α׷��� ���̾ƿ� ����)
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10, 10, 10, 10)); //���� ������ �����Ѵ�.
		hbox.setSpacing(10); //��Ʈ�� ���� ���� ����
		
		TextField textfield = new TextField();
		textfield.setPrefWidth(200); //textfield�� ���α���
		
		Button button = new Button();
		button.setText("Ȯ��");
		
		
		//button.setOnAction(event -> {Platform.exit();});
		
		//��� 1
		/*hbox.getChildren().add(textfield);
		hbox.getChildren().add(button);*/
		
		//���2
		ObservableList list = hbox.getChildren();
		//HBox�����̳ʿ� ��Ʈ�� �߰�
		list.add(textfield);
		list.add(button);
		
		
		//ȭ�鿡 ��Ʈ �����̳ʸ� ParentŬ������ ��ӹ��� HBox�� ����
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
