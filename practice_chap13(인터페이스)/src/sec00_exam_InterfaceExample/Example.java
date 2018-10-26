package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {
		A a = new Person();
		Person p = new Person();
		a.method();
		//a.method2();
		p.method2();
		
		A a1= new Member();
		a1.method();

	}

}
