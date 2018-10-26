package sec02_exam;

public class DoubleForExample {

	public static void main(String[] args) {
	
		
		for (int m=2;m<=9; m++) {
			System.out.println("***"+m+"단***");
			
			for(int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}

		/*
		   1)m=2>> ***2단***
			n=1 >> 2x1=2>> n++>> n=2
			n=2 >> 2x2=4>> n++>> n=3
			n=3 >> 2x3=6>> n++>> n=4
			.
			.
			.
			n=9 >> 2x9=18>> n++>> n=10
			n=10>> n이 9를 넘어버림 >> m++실행 >>m=3
		   2)m=3 >>***3단***출력 후
			n=1(위 m이 증가연산후에 n은 최초선언한 1로 다시 초기화됨)
			>> 3x1=3 >> n++>> n=2
			>> 이후 작업을 반복
		*/
		
		
		
		
	}

}
