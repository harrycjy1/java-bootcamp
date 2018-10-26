package sec09_verify;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력하세요"+" 0을 입력하면 종료됩니다.");
		
		while(true) {
			
		int input1 = scan.nextInt();
		
		ac.setBalance(input1);
		if(input1 == 0) {
			System.out.println("종료되었습니다.");
			break;
		}
		}
	
		
	
	
	
	}

}
