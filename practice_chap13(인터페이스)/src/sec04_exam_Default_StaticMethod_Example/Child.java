package sec04_exam_Default_StaticMethod_Example;

public class Child extends Parent implements MyInterface1,MyInterface2{

		public void childmethod() {
			System.out.println("�ڼ�Ŭ�������� ȣ���� �޼���");
		}
	
		@Override
		public void method1() {
			System.out.println("�ڼ�Ŭ�������� MYInterface�� method1()�� �������̵��� �޼���");
		}

}
