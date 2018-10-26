package sec07_exam_thread_synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
			
		//공유객체 생성
		Calculator calculator = new Calculator();
		
		//속도가 조금 느려지지만 데이터가 정확히 출력됨을 알 수 있다.
		User1 user1 = new User1();
		user1.setClaculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setClaculator(calculator);
		user2.start();
	}

}
