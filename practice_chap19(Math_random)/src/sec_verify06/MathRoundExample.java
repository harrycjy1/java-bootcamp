package sec_verify06;

public class MathRoundExample {

	static double round(double d, int n) {
		double result = (Math.round(d*Math.pow(10.0, n))/Math.pow(10.0, n));
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("�ڹٿ��� �����ϴ� Math.round(3.17836)�� �� ��� : "+Math.round(3.17836));
		
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836, 1));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,2));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,3));
		System.out.println("3.17836�� �ټ�° �ڸ����� �ݿø� �� ��� : "+round(3.17836,4));
		

	}

}
