package sec02_verify;

public class OuterExample {

	public static void main(String[] args) {
		
	System.out.println("�ܺ�Ŭ������ �������� �ʰ�, �������Ŭ����(Inner)�� ���� ��� CV�� :"+Outer.Inner.cv);
		
	Outer.Inner in = new Outer.Inner();
	
	System.out.println("�ܺ�Ŭ������ �����ϰ�, �������Ŭ����(Inner)�� �ν��Ͻ� ��� IV�� : "+in.iv);
		
		
	}
}
