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
		 * �Ʒ��� ���� primaryStage�� ũ��, �� �������� ũ�⸦ �̸� �����س��� fxml������ ��Ʈ�����̳��� ũ�⸦
		 * �ƹ��� �����غ��� �ǹ̰� ���� 
		 * �׷��� ������ ����ڴ� ������â�� �������� �Ͽ� ũ�⸦ ������ ������ �ƴϸ� ��Ʈ�����̳ʸ� �������� fxml���Ͽ��� ũ�⸦ ������
		 * �������� ���ؼ� �ڵ��ؾ��Ѵ�
		 */
		
		//arg0.setWidth(500);
		//arg0.setHeight(400);
		
		arg0.setScene(scene);
		arg0.show();
		
		
	}

}
