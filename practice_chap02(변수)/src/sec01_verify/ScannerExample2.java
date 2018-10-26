package sec01_verify;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("num1 입력 :" );		
		double num1 = scanner.nextDouble();
		System.out.println("num2 입력 :");
		double num2 = scanner.nextDouble();
	
		int result=(int)(num1-num2);
		System.out.println("result : " + result);
		
		
				
		

	}

}
