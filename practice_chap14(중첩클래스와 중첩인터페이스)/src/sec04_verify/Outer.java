package sec04_verify;

public class Outer {

	int value = 10;
	
	class Inner{
		int value = 20;
		
		public void method1() {
			
			int value=30;
			System.out.println("method1�� value�� : "+value);
			System.out.println("InnerŬ������ value�� : "+Inner.this.value);
			System.out.println("OuterŬ������ value�� : "+Outer.this.value);
		}
	}
}
