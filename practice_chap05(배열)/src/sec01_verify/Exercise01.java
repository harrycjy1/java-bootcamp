package sec01_verify;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		
		int[] num = new int [10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열수 입력 :");
		
		int count=scan.nextInt();
		
		
		for(int i=0; i<count; i++) {
			System.out.println("num["+i+"] =" + num[i]);
		}
		
		
	}

}
