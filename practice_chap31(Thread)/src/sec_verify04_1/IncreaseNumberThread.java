package sec_verify04_1;

public class IncreaseNumberThread extends Thread{

	
	private Number number;
	
	
	public IncreaseNumberThread(Number number) {
		this.number = number;
	}
		
	@Override
	public void run() {
		System.out.println("0~1000까지의 합을 구합니다.");
		System.out.print(this.getName()+"의 결과 : ");
		
		number.addNum();
	
	}
}
