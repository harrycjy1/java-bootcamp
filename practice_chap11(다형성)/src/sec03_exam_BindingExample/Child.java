package sec03_exam_BindingExample;

public class Child extends Parent{

	int x = 200;
	
	@Override
	void method() {
		//���� Ŭ������ ����� �����ϱ� ���ؼ���
		//super�� ��������� ��������Կ� ����
		super.method();
		System.out.println("Parent x : "+ super.x);
		System.out.println("Child x : "+ x);
		System.out.println("Child x : "+ this.x);
		System.out.println("Child method");
		
	}
}
