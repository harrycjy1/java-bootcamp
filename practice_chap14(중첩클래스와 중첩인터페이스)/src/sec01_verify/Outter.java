package sec01_verify;

public class Outter {

	public Outter(){
		System.out.print("�ܺ� Ŭ���� Outer�� �ν��Ͻ��� ����");
	}
	
	public class Inner{
		
		int i = 100;
		
		public Inner() {
			System.out.print("�� ��, �ν��Ͻ����Ŭ����(inner)�� �ν��Ͻ��� ����");
		}
		
		public void method() {
			System.out.println("�Ͽ� ����Ѱ� : "+i);
		}
		
	}
	
	
}
