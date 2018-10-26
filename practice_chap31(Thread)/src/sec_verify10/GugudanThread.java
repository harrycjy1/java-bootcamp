package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable{

	
	
	@Override
	public void run() {
		System.out.println("[구구단 작업 요청]");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 수를 입력하세요 : ");
		int input = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(input+ "*" +i +"="+i*input);
		}
		
	}

}
