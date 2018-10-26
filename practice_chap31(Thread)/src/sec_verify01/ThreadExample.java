package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread movie = new MovieThread();
		
		Runnable record = new RecordingRunnable();
		Thread movie2 = new Thread(record);
		
		movie.start();
		movie2.start();
		
		/*Thread test = new Thread() {
			
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					System.out.println("동영상을 재생합니다.");
					}
			}
		};
		
		test.start();
		
		Thread test2 = new Thread(new Runnable() {
			
				@Override
				public void run() {
					for(int i=0; i<3; i++) {
						System.out.println("녹화를 시작합니다.");
						}
			}
		});
		test2.start();*/

	}

}
