package sec02_exam_Nested_Class;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();//�ܺ� Ŭ���� �ν��Ͻ� ����
		//AŬ������ ����������� ����Ŭ���� �ν��Ͻ� ����
		//���� �ܺ�Ŭ���� �ν��Ͻ��� �����ؾ���
		A.B b = a.new B();
		b.method1();
		
		//����(static)����� �ν��Ͻ� ����
		A.C c = new A.C();
		System.out.println(c.b);
		A.C.method3();
		
		
		a.method();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
