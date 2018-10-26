package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread date = new DateTimeThread();
		date.setDaemon(true);
		date.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("데몬 스레드인 dateTimeThread가 종료됩니다.");
		System.out.println("main 스레드가 종료됩니다.");
	}

}
