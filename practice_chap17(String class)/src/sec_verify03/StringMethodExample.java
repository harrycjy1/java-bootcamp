package sec_verify03;

import java.util.Scanner;

public class StringMethodExample {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� ==>");
		String input = scan.nextLine();
		
		System.out.println("�Է� ���ڿ��� s�� S�� $�� ��ȯ�մϴ�.");
		String input1 = input.toLowerCase();
		
		System.out.println("��¹��ڿ� ==>"+input1.replace("s", "$"));
	}

}
