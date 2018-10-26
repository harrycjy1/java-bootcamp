package sec04_exam_Default_StaticMethod_Example;

public class default_staticExample {

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.childmethod();
		c.parentmethod2();
		c.method1();
		c.method2();
		c.method3();
		c.method4();

		//바로접근가능한 static메서드
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
		
	}

}
