package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LongStringSearch lo = new LongStringSearch();
		
		
		ArrayList<String> arr=lo.getStringList();
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"��° �̸��� �Է��ϼ��� : ");
			String name = scan.next();
			lo.addString(name);
		}
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println();
			
		lo.listprint();
		lo.longestString();

	}

}
