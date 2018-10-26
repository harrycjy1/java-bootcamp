package sec_verify03;

public class ThreadExample {

	public static void main(String[] args) {
		Thread Num = new NumberThread();
		Thread Bomb = new BombThread();
		
		Num.start();
		Bomb.start();

	}

}
