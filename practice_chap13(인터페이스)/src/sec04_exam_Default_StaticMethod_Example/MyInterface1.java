package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface1 {

		//default�� �⺻������ ���������ڰ� public
		public default void method1() {
			System.out.println("�������̽� 1�� ����� ����Ʈ �޼���1 ȣ��");
		}
		
		public default void method2() {
			System.out.println("�������̽� 1�� ����� ����Ʈ �޼���2 ȣ��");
		}
		
		public static void staticMethod() {
			System.out.println("�������̽� 1�� ����� ����(static)�޼��� ȣ��");
		}
	}
