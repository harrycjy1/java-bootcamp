package sec12.exam01_thread_wait_notify;

public class WorkObject {

	
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA()����");
		notify();
		
		try {
			//�ڱ� �ڽ��� �Ͻ����� ���°� �ȴ�.
			//(������ ������ ���·� ����)
			wait();
		} catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB()����");
		notify();
		
		try {
			//�ڱ� �ڽ��� �Ͻ����� ���°� �ȴ�.
			//(������ ������ ���·� ����)
			wait();
		} catch(InterruptedException e) {}
	}
}
