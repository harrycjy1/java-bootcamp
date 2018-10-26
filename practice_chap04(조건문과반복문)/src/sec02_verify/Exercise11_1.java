package sec02_verify;

import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int n1=1;
		int n2=1;
		int n3=1;
		int num=0;
		
		System.out.println("정수 하나를 입력하세요: ");
		
		int input = scan.nextInt();
		
		
		for(int i=1; n3<input; i++) {
			
			if(i<3) {
				n3=1;
			}
			else {
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.print(n3+ " ");
			
			
		}
		
		
		

	}

}
