package sec03.exam01_anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		/* 
		 * FXML�� �̿��� ���̾ƿ� ��ġ��, �ڹ��ڵ�� ���� �и��� 
		 * ������ �ڹ��ڵ忡 �ͼ��ϰ�����, ������ ���̾ƿ��̶�� �ڹ���ũ�� �̷��������
		 * �����ϰ� �����ϱ⵵ ��ƴ�
		 * ������ FXML���Ϸ� ���̾ƿ��� ����� , �±� �ۼ��� ������� �ͼ������� �ڵ��ľ��� �ſ� ����
		 * �ƿ﷯ �ڹ��ڵ� ������ �ǵ� �ʿ䰡 ���� �����̳ʿ� ������ �ſ� ���� �ȴ�.
		 * ��ټ��� �������� �̷��� �̷���� �ִ�
		 */
		
		//root.fxml�� �ۼ��Ȥ� ���� parent�� , �����̳ʿ� ��Ʈ���� �����ض�
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
