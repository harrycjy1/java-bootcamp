package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		double	number = -2.78987434;
		System.out.println("number�� ���밪 :"+Math.abs(number));
		System.out.println("number�� �ø��� :"+Math.ceil(number));
		System.out.println("number�� ������ :"+Math.floor(number));
		System.out.println("9.0 �� ������ :"+Math.pow(9.0, 1.0/2.0));
		System.out.println("PI�� ����� ���� :"+Math.rint(Math.PI));
		System.out.print("�̹��� ����� �ζ� ��ȣ�� ");
		for(int i=0; i<6; i++) {
		int a = (int) (Math.random()*100);
		System.out.print(a+" ");
		}
		System.out.println("�Դϴ�.");
		
	}

}
