package sec07_exam_thread_synchronized;

public class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setClaculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-2");//스레드 이름 설정
	}
	
	@Override
	public void run() {
		//공유객체의 필드인 memory값을 100으로 설정하고 있다.
		this.calculator.setMemory(50);
	}
}
