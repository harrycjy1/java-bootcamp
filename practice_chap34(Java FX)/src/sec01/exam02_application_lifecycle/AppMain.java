package sec01.exam02_application_lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	public AppMain() {
		System.out.println("������ ȣ��");
		System.out.println("���� ������  : "+Thread.currentThread().getName());
	}
	
	@Override
	public void init() throws Exception {
		//init()������ UI���� �� �����ϴ� �ڵ尡 ����� ���� �ȵȴ�. ���� �߻��Ѵ�.
		//Init()�� �ַ� ���� �Ű����� JavaFX application �����忡 ������ �������� ���ǰ� �Ѵ�.
		System.out.println("init()_����");
		System.out.println("���� ������ : "+Thread.currentThread().getName());
		super.init();
	}
	
	//���ེ�����  JavaFx Application
	@Override
	public void start(Stage primaryStage) throws Exception {
		//start()������ UI���� �� �����ϴ� �ڵ尡 ����Ǿ�� �Ѵ�.
		//��������δ� start()�� ������ �ؼ� ������ ���� �Ѵ�.
		System.out.println("start()_����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
		primaryStage.show();
		
	}
	
	@Override
	public void stop() throws Exception {
		//������ â�� Xǥ�ø� Ŭ���� �ڵ�����
		System.out.println("stop()����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
	}

	//���ེ����� ���ν�����
	public static void main(String[] args) {
		System.out.println("main()����");
		System.out.println("���ེ���� : "+Thread.currentThread().getName());
		Application.launch(args); // main�����尡 JavaFX application �����带 ������.

	}

	
}
