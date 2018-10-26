package sec06_verify;

import java.util.Scanner;

public class GoodCalcExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		GoodCalc cal = new GoodCalc();
		
		System.out.println("두 정수 (2,3)의 합 : "+cal.add(2, 3));
		System.out.println("두 정수 (2,-13)의 빼기 :"+cal.subtract(2, -13));
		
		System.out.print("몇개의 방을 만들까요?");
		int input = scan.nextInt();
		
		int[] ab = new int[input];
		for(int i=0; i<input; i++) {
			System.out.print((i+1)+"번째 값 : ");
			int input2 = scan.nextInt();
			ab[i]=input2;
		}

		System.out.printf("배열(%d, %d, %d)의 평균 : %.2f",ab[0],ab[1],ab[2],cal.average(ab));
	}

}
