package sec_verify05;

public class ExecuteThread extends Thread{
	
	private boolean	stop;     
	int i = 1;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		System.out.println("몇 초후 종료할까요 >>  10\r\n" + 
				"10초 후 종료합니다.");
		while(!stop) {
		System.out.println("실행 중 >> i값 변화 : "+i);
		i++;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		}
		System.out.println("실행종료");
		
	}
	
	
}
