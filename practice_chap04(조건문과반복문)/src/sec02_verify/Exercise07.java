package sec02_verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int num;
		
		
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(num +"*"+ i +"="+ num*i);
		}*/

	
		for(int i=1; i<=9; i++) {
			System.out.print("당신이 원하는 단은?");
			
			i=scan.nextInt();
			
			for(int j=1; j<=9; j++) {
			System.out.println(i+"x"+j+"="+i*j);
			}
		break;
		}
		
	
	}

}
