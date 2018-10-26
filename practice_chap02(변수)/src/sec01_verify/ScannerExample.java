package sec01_verify;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num1 입력 :");
				
	    int num1=scanner.nextInt();
	    System.out.print("num2 입력 :");
		
	    int num2=scanner.nextInt();
		
		int result=num1 +num2;
		System.out.println("result : " + result);
		
		
		
		
		
		

	}

}
