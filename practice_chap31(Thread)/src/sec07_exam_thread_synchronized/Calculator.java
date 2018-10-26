package sec07_exam_thread_synchronized;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	//동기화 메서드, 확실히 공유객체에 접근하기 위해서 user1이 먼저 접근하고 끝내고난뒤,
	//user2가 접근하므로 속도가 떨어지지만 데이터의 신뢰성을 보장할 수 있다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;//초기화
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		//현재 실행중인 스레드 이름과 memory값을 출력
		System.out.println(Thread.currentThread().getName() +" : "+this.memory);
	}
	
}
