package sec03.exam05_tilepane;

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
	public void start(Stage arg0) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		
		arg0.setTitle("TilePaneExample");
		/*
		 * 아래와 같이 primaryStage의 크기, 즉 윈도우의 크기를 미리 설정해놓코 fxml파일의 루트컨테이너의 크기를
		 * 아무리 설정해봐야 의미가 없다 
		 * 그렇기 때문에 사용자는 윈도우창을 기준으로 하여 크기를 설정할 것인지 아니면 루트컨테이너를 기준으로 fxml파일에서 크기를 설정할
		 * 것인지를 정해서 코딩해야한다
		 */
		
		//arg0.setWidth(500);
		//arg0.setHeight(400);
		
		arg0.setScene(scene);
		arg0.show();
		
		
	}

}
