package sec_verify03;

import java.util.Scanner;

public class StringMethodExample {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 ==>");
		String input = scan.nextLine();
		
		System.out.println("입력 문자열의 s와 S를 $로 변환합니다.");
		String input1 = input.toLowerCase();
		
		System.out.println("출력문자열 ==>"+input1.replace("s", "$"));
	}

}
