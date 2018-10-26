package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LongStringSearch lo = new LongStringSearch();
		
		
		ArrayList<String> arr=lo.getStringList();
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 이름을 입력하세요 : ");
			String name = scan.next();
			lo.addString(name);
		}
		System.out.println("입력이 완료 되었습니다.");
		System.out.println();
			
		lo.listprint();
		lo.longestString();

	}

}
