package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {
		
		Toilet to = new Toilet();
		
		Thread t1 = new ToiletUsingThread(to, "아버지");
		t1.start();
		
		Thread t2 = new ToiletUsingThread(to, "딸");
		t2.start();
		
		Thread t3 = new ToiletUsingThread(to, "아들");
		t3.start();
		
		Thread t4 = new ToiletUsingThread(to, "어머니");
		t4.start();

	}

}
