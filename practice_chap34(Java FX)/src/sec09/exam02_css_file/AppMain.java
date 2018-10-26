package sec09.exam02_css_file;


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
		
		
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene = new Scene(parent);
		
		//�ܺο��� �ۼ��� CSS������ SCene�� �����Ѵ�
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setTitle("Main");
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
