package sec02_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ϳ��� ������ �Է��ϼ���");
		
		int num = scan.nextInt();
		
		if(num%2==0&&num%3==0) {
			System.out.println(num+"�� 2�� 3�� ����Դϴ�.");
		}
		
		else  {
			System.out.println(num+"�� 2�� 3�� ����� �ƴմϴ�.");
		}
		

	}

}
