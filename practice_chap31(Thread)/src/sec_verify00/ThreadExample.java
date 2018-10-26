package sec_verify00;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new TestThread();
		thread.start();
		

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i<10; i++) {
					System.out.println(i+" 번째 Test스레드의 실행내용입니다");
				}
				System.out.println("Test스레드가 종료됩니다.");
				
			}
		});
		
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				for(int i =0; i<10; i++) {
					System.out.println(i+" 번째 Test스레드의 실행내용입니다");
				}
				System.out.println("Test스레드가 종료됩니다.");
				
			}
		};
		
		thread1.start();
		thread3.start();
	}

}
