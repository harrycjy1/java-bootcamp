package sec07_exam_thread_synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
			
		//������ü ����
		Calculator calculator = new Calculator();
		
		//�ӵ��� ���� ���������� �����Ͱ� ��Ȯ�� ��µ��� �� �� �ִ�.
		User1 user1 = new User1();
		user1.setClaculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setClaculator(calculator);
		user2.start();
	}

}
