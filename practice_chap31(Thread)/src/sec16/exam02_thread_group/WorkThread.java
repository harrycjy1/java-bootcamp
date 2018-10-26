package sec16.exam02_thread_group;

public class WorkThread extends Thread{
	
	//생성자 (조상클래스 그룹, 자신의 스레드 이름)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	
	@Override
	public void run() {
		//현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("스레드명 : "+ Thread.currentThread().getName()+
				", 스레드 그룹명 : "+str);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName()+" interrupted!!");
				System.out.println(this.getName()+" 종료됨 !");
				break;
			}
		}
		
	}
}
