package sec_verify04_3;

public class Toilet {
	
	private boolean seat;
	
	public synchronized void use() {
	System.out.println(Thread.currentThread().getName()+" ��/�� ȭ��ǿ� �����Ͽ����ϴ�.");
	System.out.println(Thread.currentThread().getName()+" �� �� : �� �ÿ��ϴ�.");
	System.out.println(Thread.currentThread().getName()+" ��/�� ȭ��� ����� ���ƽ��ϴ�.");
	
	try {
		Thread.sleep(1000);
		System.out.println();
		}
	catch (InterruptedException e) {
		e.printStackTrace();
		}
	
	}
	

}