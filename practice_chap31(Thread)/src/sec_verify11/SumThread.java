package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하신 사이의 정수의 합을 구합니다");
		System.out.print("첫 번째 정수 : ");
		int input1 = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int input2 = scan.nextInt();
		
		for(int i= input1; i<=input2; i++) {
			sum+=i;
		}
		return sum;
	}
}
