package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface2 {

		//default�� �⺻������ ���������ڰ� public
		public default void method3() {
			System.out.println("�������̽� 2�� ����� ����Ʈ �޼���1 ȣ��");
		}
		
		public default void method4() {
			System.out.println("�������̽� 2�� ����� ����Ʈ �޼���2 ȣ��");
		}
		
		public static void staticMethod() {
			System.out.println("�������̽� 2�� ����� ����(static)�޼��� ȣ��");
		}
	}
