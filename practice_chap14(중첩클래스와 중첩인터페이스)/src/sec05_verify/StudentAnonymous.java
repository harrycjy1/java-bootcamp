package sec05_verify;

public class StudentAnonymous {
	
	
	Student field = new Student("������") {
		
		public void goSchool() {
			System.out.println(name+"�� ��մϴ�.");
		}
		@Override
		public void wake() {
			System.out.println("================================");
			System.out.println("�ʵ�(�������)�� �ʱⰪ���� ������ �ڽİ�ü");
			System.out.println(name+"�� 6�ÿ� �Ͼ�ϴ�.");
			goSchool();
			System.out.println("================================");
		}
		
	};
	
	
	public void method1() {
		Student localvar = new Student("���ѱ�") {
			public void goMoving() {
				System.out.println(name+"�� ��ȭ�� �������ϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("================================");
				System.out.println("���ú����� �ʱⰪ���� ������ �ڽ� ��ü");
				System.out.println(name + "�� 9�ÿ� �Ͼ�ϴ�.");
				goMoving();
				System.out.println("================================");
			}
		};
		localvar.wake();
	}
	
	public void method2(Student student) {
		student.wake();
	}
	

}
