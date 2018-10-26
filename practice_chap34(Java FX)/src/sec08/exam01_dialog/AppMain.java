package sec08.exam01_dialog;

import java.util.Arrays;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		
		launch(args);
		
		
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		/*FXMLloader��ü�� ���� �����ؼ� �ν��Ͻ� �ż����� load()�� ���� Stage�� ����� 
		�ƿ﷯ ��Ʈ�ѷ��� ������ ��� setter�޼��带 ȣ��*/
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		RootController rootController = loader.getController();
		//Setter�� �Ű������� primaryStage�� �ѱ�� RootContoroller����
		//���������� ������ ������ �ִ�.
		rootController.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Main");
		
		
		
	}

}
