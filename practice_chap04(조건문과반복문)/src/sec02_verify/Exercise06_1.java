package sec02_verify;

import java.util.Scanner;

public class Exercise06_1 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		
		System.out.println("  1.���� | 2.���� | 3.����");
		
		while(run) {
			
			System.out.print("���� : ");
			keyCode = scan.nextInt();
			if(keyCode==1) {
				speed++;
				System.out.println("���� �ӵ� = "+ speed);
			}
			else if(keyCode==2){
				speed--;
				System.out.println("���� �ӵ� = "+ speed);
			}
			else {
				System.out.println("���α׷� ����");
			break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
