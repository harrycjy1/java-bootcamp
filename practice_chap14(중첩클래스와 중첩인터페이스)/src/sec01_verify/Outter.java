package sec01_verify;

public class Outter {

	public Outter(){
		System.out.print("외부 클래스 Outer의 인스턴스를 생성");
	}
	
	public class Inner{
		
		int i = 100;
		
		public Inner() {
			System.out.print("한 후, 인스턴스멤버클래스(inner)의 인스턴스를 생성");
		}
		
		public void method() {
			System.out.println("하여 출력한값 : "+i);
		}
		
	}
	
	
}
