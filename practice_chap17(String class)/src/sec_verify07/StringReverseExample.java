package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = scan.nextLine();
		
		StringBuffer sf = new StringBuffer();
		
		sf.append(input);
		
		System.out.println("������ �Ųٷ� ��� ==> "+sf.reverse());

	}

}
