package sec01.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName = Thread.currentThread().getName();
		
		System.out.println("���� ������ : "+threadName);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("���� ������ : "+threadName);
		//�ڹ� FX���ø����̼� �����带 �����Ͽ� start()�� ȣ�����ش�
		Application.launch(args);
	}
	
	

}
