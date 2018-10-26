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
			
		System.out.println("myMethod()�� ȣ���� LocalInnerŬ���� ������ ������� �� ��� : "+local.iv);
		System.out.println("myMethod()�� ȣ���� final static���� �� ��� : "+LocalInner.CONST);
	}

	public static void main(String[] args) {
		
		Inner inner = new Inner();
		Inner.InstanceInner ii = inner.new InstanceInner();
			
		System.out.println("����Ŭ���� InstanceInner final static��� ���� �� ��� : " + InstanceInner.CONST);
		System.out.println("����Ŭ���� InstanceInner�� ���� �� �ν��Ͻ� ��� ���� �� ��� : " + ii.iv);		
			
		Inner.StaticInner si = new Inner.StaticInner();
			
		System.out.println("StaticInnerŬ������ final static��������� ��� : " + StaticInner.CONST);
		System.out.println("StaticInnerŬ������ static��������� ��� : " + StaticInner.cv);
		System.out.println("����(����)Ŭ���� StaticInner�� ���� �� static��������� ��� : " + si.iv);
			        
	        inner.myMethod();
	}



}
