package sec09_verify;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���"+" 0�� �Է��ϸ� ����˴ϴ�.");
		
		while(true) {
			
		int input1 = scan.nextInt();
		
		ac.setBalance(input1);
		if(input1 == 0) {
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		}
	
		
	
	
	
	}

}
