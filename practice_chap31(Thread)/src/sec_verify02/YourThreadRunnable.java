package sec_verify02;

public class YourThreadRunnable implements Runnable{

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

}
