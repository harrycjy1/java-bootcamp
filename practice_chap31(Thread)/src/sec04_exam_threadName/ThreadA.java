package sec04_exam_threadName;

public class ThreadA extends Thread	{
	
	public ThreadA() {
		this.setName("ThreadA");
	}
	
	@Override
	public void run() {
		System.out.println("[����������� �������] : "+ this.getName());
		for(int i=0; i<2; i++) {
			//���⼭�� getName()�� ThreadA�� �ν��Ͻ� �޼������� ����.
			System.out.println(this.getName()+" �� ����� ����");
		}
	}
}
