package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread date = new DateTimeThread();
		date.setDaemon(true);
		date.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("���� �������� dateTimeThread�� ����˴ϴ�.");
		System.out.println("main �����尡 ����˴ϴ�.");
	}

}
