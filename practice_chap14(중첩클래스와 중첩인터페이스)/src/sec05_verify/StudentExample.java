package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {
		
		
		StudentAnonymous a = new StudentAnonymous();
		a.field.wake();
		a.method1();
		
		
		a.method2(new Student("�迬��") {
			public void study() {
				System.out.println(name+"�� �����մϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("================================");
				System.out.println("�Ű������� �Ű������� �͸��ڼհ�ü�� ����");
				System.out.println(name+"�� 4�ÿ� �Ͼ�ϴ�.");
				study();
				System.out.println("================================");
			}
		});
		

	}

}
