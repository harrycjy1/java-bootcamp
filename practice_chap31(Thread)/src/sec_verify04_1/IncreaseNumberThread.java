package sec_verify04_1;

public class IncreaseNumberThread extends Thread{

	
	private Number number;
	
	
	public IncreaseNumberThread(Number number) {
		this.number = number;
	}
		
	@Override
	public void run() {
		System.out.println("0~1000������ ���� ���մϴ�.");
		System.out.print(this.getName()+"�� ��� : ");
		
		number.addNum();
	
	}
}
