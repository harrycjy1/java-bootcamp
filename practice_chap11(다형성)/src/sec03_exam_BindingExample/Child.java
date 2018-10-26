package sec03_exam_BindingExample;

public class Child extends Parent{

	int x = 200;
	
	@Override
	void method() {
		//조상 클래스의 멤버에 접근하기 위해서는
		//super를 명시적으로 적어줘야함에 주의
		super.method();
		System.out.println("Parent x : "+ super.x);
		System.out.println("Child x : "+ x);
		System.out.println("Child x : "+ this.x);
		System.out.println("Child method");
		
	}
}
