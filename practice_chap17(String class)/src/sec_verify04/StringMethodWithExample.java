package sec_verify04;

import java.util.Scanner;

public class StringMethodWithExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� ==>");
		String input = scan.nextLine();
		System.out.println("�Է� ���ڿ��� ���۰� ���� ���� '(' ')'�� �ƴϸ�, '(' ')'�ٿ� ����մϴ�. ");
		
		if(!input.startsWith("(")&&!input.endsWith(")")) {
			System.out.println("("+input+")");
		}
		

	}

}
