package sec_verify07;

public class InterruptExample {

	public static void main(String[] args) {
		
		
			DrawThread draw = new DrawThread();
			
			draw.start();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			draw.interrupt();

	}

}
