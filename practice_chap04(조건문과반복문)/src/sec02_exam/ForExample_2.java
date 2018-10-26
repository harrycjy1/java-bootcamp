package sec02_exam;

public class ForExample_2 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
		
		for(i=1;i<=100;i++) {
			sum+=i;
		}//인트i선언을 for()문안에서 선언하는것도 가능,
		 //but 그경우엔 i변수값의 범위가 for문 {}안까지만 가능하다.
		
		System.out.println("1~"+(i-1)+"합 :"+ sum);
		
		
		
		
		
	}

}
