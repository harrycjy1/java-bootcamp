package sec_verify00;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new TestThread();
		thread.start();
		

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10; i++) {
					System.out.println(i+" ��° Test�������� ���೻���Դϴ�");
				}
				System.out.println("Test�����尡 ����˴ϴ�.");
				
			}
		});
		
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				for(int i =0; i<10; i++) {
					System.out.println(i+" ��° Test�������� ���೻���Դϴ�");
				}
				System.out.println("Test�����尡 ����˴ϴ�.");
				
			}
		};
		
		thread1.start();
		thread3.start();
	}

}
