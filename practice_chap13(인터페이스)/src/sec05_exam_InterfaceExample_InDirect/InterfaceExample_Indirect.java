package sec05_exam_InterfaceExample_InDirect;

public class InterfaceExample_Indirect {

	public static void main(String[] args) {
		
		A a = new A();
		a.methodA(new B());//BŬ������ I�������̽��� �����ϰ� �ֱ⶧���� B�ν��Ͻ������ؼ� �ִ°� ������.
		
		I i = new B();
		i.methodB();

	}

}
