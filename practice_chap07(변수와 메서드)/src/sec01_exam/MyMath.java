package sec01_exam;

public class MyMath {

	
	//2���� �ν��Ͻ� ����޼���,2���� static�޼���
	//return���� �׻� 1���� �� �ּ�ȭ�����ִ°� ����
	long a,b=0;
	
	public long add(long a,long b) {
		long result=a+b;
		return result;
		//return a+b; ���� ������ �̿Ͱ��� ���ٷ� ������ �Ҽ� �ִ�.
		
	}


	public long subtract(long a, long b) {
		//MyMath.multiply(a, b); //static�޼��带 �ν��Ͻ��ȿ� �ִ°� �����ϴ�.
		return a-b;
	}
	
	public static long multiply(long a,long b) {
		return a*b;
	}

	public static long divide(long a, long b) {
		return a/b;
	}

	public String studyJava() {
		//MyMath.divide(a, b);
		return "�ڹټ����� �մϴ�.";    //�ν��Ͻ��޼���ȿ��� static�ֱ� ����
								   //but, static�޼���ȿ� instance�޼��带 ������ ����.	
	}









}
