package sec02_exam_Nested_Class;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();//외부 클래스 인스턴스 생성
		//A클래스의 멤버변수격은 내부클래스 인스턴스 생성
		//필히 외부클래스 인스턴스가 존재해야함
		A.B b = a.new B();
		b.method1();
		
		//정적(static)멤버인 인스턴스 생성
		A.C c = new A.C();
		System.out.println(c.b);
		A.C.method3();
		
		
		a.method();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
