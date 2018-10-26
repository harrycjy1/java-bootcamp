package sec_verify06;

public class MathRoundExample {

	static double round(double d, int n) {
		double result = (Math.round(d*Math.pow(10.0, n))/Math.pow(10.0, n));
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("자바에서 제공하는 Math.round(3.17836)를 한 결과 : "+Math.round(3.17836));
		
		System.out.println("3.17836를 둘째 자리에서 반올림 한 결과 : "+round(3.17836, 1));
		System.out.println("3.17836를 셋째 자리에서 반올림 한 결과 : "+round(3.17836,2));
		System.out.println("3.17836를 넷째 자리에서 반올림 한 결과 : "+round(3.17836,3));
		System.out.println("3.17836를 다섯째 자리에서 반올림 한 결과 : "+round(3.17836,4));
		

	}

}
