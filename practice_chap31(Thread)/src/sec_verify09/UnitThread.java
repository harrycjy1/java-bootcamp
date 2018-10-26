package sec_verify09;

public class UnitThread extends Thread{
	
	public UnitThread(ThreadGroup threadGroup, String title) {
		super(threadGroup,title);
	}

	
	@Override
	public void run() {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		
		System.out.println("���� �������� ������� : "+ this.getName()+" ������ �׷�� : "+ 
						main.getName()+" �θ�׷�� : "+main.getParent().getName());
		
		while(true) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+" interrupted!!");
				
				break;
			}
		}
		System.out.println(this.getName()+" �����!");	
	}
}
