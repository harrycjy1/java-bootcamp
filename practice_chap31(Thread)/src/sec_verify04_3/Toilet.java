package sec_verify04_3;

public class Toilet {
	
	private boolean seat;
	
	public synchronized void use() {
	System.out.println(Thread.currentThread().getName()+" 이/가 화장실에 입장하였습니다.");
	System.out.println(Thread.currentThread().getName()+" 의 말 : 아 시원하다.");
	System.out.println(Thread.currentThread().getName()+" 이/가 화장실 사용을 마쳤습니다.");
	
	try {
		Thread.sleep(1000);
		System.out.println();
		}
	catch (InterruptedException e) {
		e.printStackTrace();
		}
	
	}
	

}