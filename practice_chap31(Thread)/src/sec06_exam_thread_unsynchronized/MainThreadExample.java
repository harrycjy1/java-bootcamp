package sec06_exam_thread_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
			
		//������ü ����
		Calculator calculator = new Calculator();
		
		//������ �����ΰ�? ��°���� ���� user2rk������ ������ �� ��µȴ�.
		//������ �ذ��ϱ� ���� ����ȭ�� �ʿ��� ���̴�.
		
		User1 user1 = new User1();
		user1.setClaculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setClaculator(calculator);
		user2.start();
	}

}
