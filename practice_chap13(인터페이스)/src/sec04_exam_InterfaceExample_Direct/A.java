package sec04_exam_InterfaceExample_Direct;

public class A {

		//매개값이 클래스B 타입이다. 다시말해, B가 변경이 있으면,
		//A에도 영향을 미친다.
		public void methodA(B b) {
			b.methodB();
	}
}
