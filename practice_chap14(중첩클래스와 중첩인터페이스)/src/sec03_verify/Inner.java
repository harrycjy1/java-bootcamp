package sec03_verify;

public class Inner {

	
	public class InstanceInner{
		final static int CONST = 100;
		int iv =100;
	}
	
	public static class StaticInner{
		final static int CONST=500;
		static int cv=200;
		int iv=200;
	}
	
	public void myMethod() {
		
			class LocalInner{
			int iv =300;
			final static int CONST = 300;
			}
			LocalInner local=new LocalInner();
			
		System.out.println("myMethod()를 호출후 LocalInner클래스 생성후 멤버변수 값 출력 : "+local.iv);
		System.out.println("myMethod()를 호출후 final static변수 값 출력 : "+LocalInner.CONST);
	}

	public static void main(String[] args) {
		
		Inner inner = new Inner();
		Inner.InstanceInner ii = inner.new InstanceInner();
			
		System.out.println("내부클래스 InstanceInner final static멤버 변수 값 출력 : " + InstanceInner.CONST);
		System.out.println("내부클래스 InstanceInner를 생성 후 인스턴스 멤버 변수 값 출력 : " + ii.iv);		
			
		Inner.StaticInner si = new Inner.StaticInner();
			
		System.out.println("StaticInner클래스의 final static멤버변수값 출력 : " + StaticInner.CONST);
		System.out.println("StaticInner클래스의 static멤버변수값 출력 : " + StaticInner.cv);
		System.out.println("내부(정적)클래스 StaticInner를 생성 후 static멤버변수값 출력 : " + si.iv);
			        
	        inner.myMethod();
	}



}
