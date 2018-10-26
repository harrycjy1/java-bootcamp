package sec04_exam_threadName;

public class ThreadA extends Thread	{
	
	public ThreadA() {
		this.setName("ThreadA");
	}
	
	@Override
	public void run() {
		System.out.println("[현재실행중인 스레드명] : "+ this.getName());
		for(int i=0; i<2; i++) {
			//여기서의 getName()은 ThreadA의 인스턴스 메서드임을 알자.
			System.out.println(this.getName()+" 가 출력한 내용");
		}
	}
}
