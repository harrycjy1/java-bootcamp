package sec03_exam;

public class FactorialExample {

	public static void main(String[] args) {
		
		long result = FactorialExample.factorial(5L);
		System.out.println("5!(���丮��)�� : "+ result);
		
		
		

	}
	
	//�ڱ� �ڽ��� ȣ���ϴ� ���
	//for������ �ص� �ǳ�, �ڵ带 ���°Ͱ� �ڵ� �ߺ��� ���������ν� ����.

	public static long factorial(long n) {
		long result = 0L;
		if(n==1) {
			result = 1;
		}
		else {
			System.out.println("result �� : "+result+" n�� �� : "+n);
			result = n*factorial(n-1);//�޼��� �ڽ��� ȣ��
		}
	return result;
	
	}
}
