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
		
		/*FXMLloader객체를 직접 생성해서 인스턴스 매서드인 load()를 통해 Stage를 만들고 
		아울러 컨트롤러의 참조를 얻어 setter메서드를 호출*/
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		RootController rootController = loader.getController();
		//Setter의 매개값으로 primaryStage를 넘기면 RootContoroller에서
		//주윈도우의 참조를 얻을수 있다.
		rootController.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Main");
		
		
		
	}

}
