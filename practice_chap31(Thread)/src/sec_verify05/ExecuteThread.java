package sec_verify05;

public class ExecuteThread extends Thread{
	
	private boolean	stop;     
	int i = 1;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		System.out.println("�� ���� �����ұ�� >>  10\r\n" + 
				"10�� �� �����մϴ�.");
		while(!stop) {
		System.out.println("���� �� >> i�� ��ȭ : "+i);
		i++;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		}
		System.out.println("��������");
		
	}
	
	
}
