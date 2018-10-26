package sec02_verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		System.out.println("정수 입력 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		 int num = scanner.nextInt();
		
			if(num%3==0) {
				System.out.println("3의 배수입니다.");	
			}
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
		
		
		scanner.close();
			

	}

}
