package sec06_exam_thread_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
			
		//공유객체 생성
		Calculator calculator = new Calculator();
		
		//문제가 무엇인가? 출력결과를 보면 user2rk변경한 값으로 다 출력된다.
		//문제를 해결하기 위해 동기화가 필요한 것이다.
		
		User1 user1 = new User1();
		user1.setClaculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setClaculator(calculator);
		user2.start();
	}

}
