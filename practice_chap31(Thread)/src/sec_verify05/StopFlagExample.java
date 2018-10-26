package sec_verify05;

public class StopFlagExample {

	public static void main(String[] args) {
		
		ExecuteThread ex = new ExecuteThread();
		
		ex.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		
		ex.setStop(true);
	}

}
