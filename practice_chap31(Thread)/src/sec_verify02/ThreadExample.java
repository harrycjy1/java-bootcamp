package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread my = new MyThread();
		Runnable you = new YourThreadRunnable();
		Thread your = new Thread(you);

	
			
			my.start();
			
			your.start();
			
		
		Thread my1 = new Thread() {
			@Override
			public void run() {
				try {
					
					for(int i=0; i<5; i++) {
						System.out.println("MyThread");
						Thread.sleep(1000);
						}
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
			
		Thread your2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					for(int i=0; i<5; i++) {
						System.out.println("YourThread");
						}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});
			
		/*my1.start();
		your2.start();
		*/
	
		
	}
}
