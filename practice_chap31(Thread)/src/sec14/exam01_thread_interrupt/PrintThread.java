package sec14.exam01_thread_interrupt;

public class PrintThread extends Thread{
	
	@Override
	public void run() {
		//아래는 일부러 일시정지 상태로 만든것이다 실전에서는 이런코딩은 없다
		/*try {
			while(true) {
				System.out.println("실행중 ");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("예외발생");
			System.out.println("스레드 자원 정리");
			System.out.println("스레드 종료");
		}*/
		
		//정적 메서드인 interrupted()와 인스턴스 메서드인 isInterrupted()를 이용한
		//스레드 종료방법
		
		while(true) {
			System.out.println("실행 중");
			//interrupt()가 호출 되었느냐?
			if(Thread.interrupted()) //interrupt()가 호출되면 true를 리턴 즉 반복문 탈출
				break;
			//if(this.isInterrupted())
			//break;
			
		}
		System.out.println("interrupt()호출 됨");
		System.out.println("스레드 자원 정리");
		System.out.println("스레드 종료");
		
	}
}
			/*
			결과론적으로 스레드의 반복문을 종료하기 위해서는 가장 좋은 방법이 interrupt()를 이용하는			 
			것이 가장 이상적이다. 일시정지에 있건 없건 간에 정상적인 종료로 유도하는 방법중 가장 널리 이용된다.
			*/