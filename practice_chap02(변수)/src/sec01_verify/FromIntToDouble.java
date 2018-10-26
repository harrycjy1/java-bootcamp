package sec01_verify;

public class FromIntToDouble {

	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		double num3 = num2;
		
		
		num2 = (int)num3;
		
		int result = num1 - num2;
		
		System.out.println("num3를 int로 강제캐스팅 후, num1 - num2의 결과 값 :" + result);
		
		
		
		
		

	}

}
