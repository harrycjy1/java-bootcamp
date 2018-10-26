package sec_verify04;

import java.util.Scanner;

public class StringMethodWithExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 ==>");
		String input = scan.nextLine();
		System.out.println("입력 문자열의 시작과 끝이 각각 '(' ')'이 아니면, '(' ')'붙여 출력합니다. ");
		
		if(!input.startsWith("(")&&!input.endsWith(")")) {
			System.out.println("("+input+")");
		}
		

	}

}
