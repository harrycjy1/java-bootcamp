package sec02_verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		System.out.println("���� �Է� : ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		 int num = scanner.nextInt();
		
			if(num%3==0) {
				System.out.println("3�� ����Դϴ�.");	
			}
			else {
				System.out.println("3�� ����� �ƴմϴ�.");
			}
		
		
		scanner.close();
			

	}

}
