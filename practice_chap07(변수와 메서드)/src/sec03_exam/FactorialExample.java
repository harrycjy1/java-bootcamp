package sec03_exam;

public class FactorialExample {

	public static void main(String[] args) {
		
		long result = FactorialExample.factorial(5L);
		System.out.println("5!(팩토리얼)값 : "+ result);
		
		
		

	}
	
	//자기 자신을 호추하는 재귀
	//for문으로 해도 되나, 코드를 보는것과 코드 중복을 제거함으로써 좋다.

	public static long factorial(long n) {
		long result = 0L;
		if(n==1) {
			result = 1;
		}
		else {
			System.out.println("result 값 : "+result+" n의 값 : "+n);
			result = n*factorial(n-1);//메서드 자신을 호출
		}
	return result;
	
	}
}
