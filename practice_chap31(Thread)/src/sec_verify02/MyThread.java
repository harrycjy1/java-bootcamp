package sec_verify02;

public class MyThread extends Thread{

	
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
}
