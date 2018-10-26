package sec05_exam_InterfaceExample_InDirect;

public class A {

		//클래스 B가 완성이 되어있지 않아도 선언부 즉 인터페이스에 있는 추상메서드인
		//선언부만 알고있으면 언제든지 호출이 가능해진다.
		//(간접적관계)
		public void methodA(I i) {
			i.methodB();
	}
}
