package sec01_verify;

import java.util.Scanner;

public class ScannerExample4_String {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("input입력 : ");
		String input = scanner.nextLine();
		//im a student 입력
		
		System.out.println("입력한 문자열은 " + input +"입니다.");
	}

}
