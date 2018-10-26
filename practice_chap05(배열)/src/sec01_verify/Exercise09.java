package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] a = new String[]{"50000", "10000", "5000","1000","100", "50", "10", "5", "1"};
		
	
		/*
		int show=Integer.parseInt(a[1]);
		System.out.println(show);*/
		
		System.out.print("금액을 입력하시오>> ");
		
		int input = scan.nextInt();
		
		System.out.println();		
		for(int i=0; i>a.length; i++) {
		
			if(input>=50000) {
				int a1= input/50000;
				System.out.println(a[i]+"원권" + a1 +"매");
			}

		}
		
		














		
		
		
		
		
		
		
		
	}

}
