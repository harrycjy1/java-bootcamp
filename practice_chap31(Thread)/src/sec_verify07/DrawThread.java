package sec_verify07;

public class DrawThread extends Thread{
	
	@Override
	public void run() {
	
		while(true) {
		System.out.println("�׸� �׸��� ��");
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("interrupt()ȣ���");
			break;
		}
		}
		System.out.println("������ �ڿ�����");
		System.out.println("������ ����");
	}

}
