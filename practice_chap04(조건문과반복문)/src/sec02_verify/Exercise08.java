package sec02_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요");
		
		int num = scan.nextInt();
		
		if(num%2==0&&num%3==0) {
			System.out.println(num+"은 2와 3의 배수입니다.");
		}
		
		else  {
			System.out.println(num+"은 2와 3의 배수가 아닙니다.");
		}
		

	}

}
