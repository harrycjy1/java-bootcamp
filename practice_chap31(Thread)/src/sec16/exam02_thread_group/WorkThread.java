package sec16.exam02_thread_group;

public class WorkThread extends Thread{
	
	//������ (����Ŭ���� �׷�, �ڽ��� ������ �̸�)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	
	@Override
	public void run() {
		//���� ����ǰ� �ִ� ������ �׷��� ����
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("������� : "+ Thread.currentThread().getName()+
				", ������ �׷�� : "+str);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+" interrupted!!");
				System.out.println(this.getName()+" ����� !");
				break;
			}
		}
		
	}
}
