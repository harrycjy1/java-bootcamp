package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		
		System.out.println("main()");
		
		CallStackExample.firstMethod();
		System.out.println("main()�� �����ϴ�.");
	}

	static void firstMethod() {
		System.out.println("firstMethod()");
		//static�� static�� �θ����ֵ�.
		CallStackExample.secondMethod();
		System.out.println("main()���� ���ư��ϴ�.");
		return;
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
		System.out.println("firstMethod()�� ���ư��ϴ�.");
		return;
	}
	
	
	
	
	
	
	
}
