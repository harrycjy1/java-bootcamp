package sec14.exam01_thread_interrupt;

public class InterruptExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		//1���� interrupt() ȣ���� �Ͻ����� ���¿� �ִ� printThread�� ���� �߻���
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.interrupt();

	}

}
