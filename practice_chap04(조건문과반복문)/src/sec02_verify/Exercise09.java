package sec02_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		

		int total =0;
		String input;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("��ǰ�ݾ��� �Է��ϼ��� : ");
			input= scan.nextLine();
			
			if(input.equals("��")) {
				System.out.println("�����Ͻ� ��ǰ���� �Ѱ����� "+total+"�Դϴ�.");
				break;		
			}
			
			
			else {
				total += Integer.parseInt(input);
				
			}	
			
				
		}
				
		
	}

}
