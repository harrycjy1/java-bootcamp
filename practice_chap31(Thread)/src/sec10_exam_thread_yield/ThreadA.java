package sec10_exam_thread_yield;

public class ThreadA extends Thread{

		public boolean stop = false;
		public boolean work = true;
		
		@Override
		public void run() {
		
			//무한루프
			while(!stop) {
				if(work) {
					//너무 빨리 루핑하니깐 설정
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {}
				 System.out.println("ThreadA 작업 내용");

				}
				else {
					//무의미한 반복을 막기위해 다른스레드에게 양보
					//(동일 우선순위나 그 이상인 스레드 에게)
					Thread.yield();
				}
				
			}
			System.out.println("ThreadA 종료");
		}
}
