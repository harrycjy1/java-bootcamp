package sec_verify07;

public class DrawThread extends Thread{
	
	@Override
	public void run() {
	
		while(true) {
		System.out.println("그림 그리는 중");
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("interrupt()호출됨");
			break;
		}
		}
		System.out.println("스레드 자원정리");
		System.out.println("스레드 종료");
	}

}
