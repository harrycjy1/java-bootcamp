package sec14.exam02_thread_interrupt;

public class CountThread extends Thread{
	
	@Override
	public void run() {
		int i =10;
		while(true) {
		System.out.println("ī��Ʈ �ٿ� : "+ i--);
		if(Thread.interrupted()) {
			System.out.println("interrupt() ȣ���");
			break;
		}
		//�����尡 �ʹ� ���� ���ư��ϱ� �Ϻη� �ð� ����
		for(long x=0; x<250000000L; x++) {}
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
