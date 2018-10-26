package sec14.exam01_thread_interrupt;

public class PrintThread extends Thread{
	
	@Override
	public void run() {
		//�Ʒ��� �Ϻη� �Ͻ����� ���·� ������̴� ���������� �̷��ڵ��� ����
		/*try {
			while(true) {
				System.out.println("������ ");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("���ܹ߻�");
			System.out.println("������ �ڿ� ����");
			System.out.println("������ ����");
		}*/
		
		//���� �޼����� interrupted()�� �ν��Ͻ� �޼����� isInterrupted()�� �̿���
		//������ ������
		
		while(true) {
			System.out.println("���� ��");
			//interrupt()�� ȣ�� �Ǿ�����?
			if(Thread.interrupted()) //interrupt()�� ȣ��Ǹ� true�� ���� �� �ݺ��� Ż��
				break;
			//if(this.isInterrupted())
			//break;
			
		}
		System.out.println("interrupt()ȣ�� ��");
		System.out.println("������ �ڿ� ����");
		System.out.println("������ ����");
		
	}
}
			/*
			����������� �������� �ݺ����� �����ϱ� ���ؼ��� ���� ���� ����� interrupt()�� �̿��ϴ�			 
			���� ���� �̻����̴�. �Ͻ������� �ְ� ���� ���� �������� ����� �����ϴ� ����� ���� �θ� �̿�ȴ�.
			*/