package sec15_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread auto = new AutoSaveThread();
		
		auto.setDaemon(true);
		auto.start();
		
		if(auto.isDaemon())
			System.out.println("auotoSaveThread는 데몬스레드 입니다.");
			//메인스레드가 5초동안 정지하면 daemon스레드인 autoSaveThread()가
			//실행되고 메인스레드가 종료되면 더이상 autoSaveThread가 실행이 안된다.
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		
		System.out.println("메인스레드 종료됨");
		
	}

}
