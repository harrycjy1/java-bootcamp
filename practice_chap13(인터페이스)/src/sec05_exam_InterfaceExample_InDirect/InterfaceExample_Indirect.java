package sec05_exam_InterfaceExample_InDirect;

public class InterfaceExample_Indirect {

	public static void main(String[] args) {
		
		A a = new A();
		a.methodA(new B());//B클래스가 I인터페이스를 구현하고 있기때문에 B인스턴스생성해서 넣는게 가능함.
		
		I i = new B();
		i.methodB();

	}

}
