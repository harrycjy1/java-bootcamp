package sec02_verify;

import java.util.Scanner;

public class Exercise06_1 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		
		System.out.println("  1.증속 | 2.감속 | 3.중지");
		
		while(run) {
			
			System.out.print("선택 : ");
			keyCode = scan.nextInt();
			if(keyCode==1) {
				speed++;
				System.out.println("현재 속도 = "+ speed);
			}
			else if(keyCode==2){
				speed--;
				System.out.println("현재 속도 = "+ speed);
			}
			else {
				System.out.println("프로그램 종료");
			break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
