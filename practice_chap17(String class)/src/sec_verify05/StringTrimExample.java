package sec_verify05;

import java.util.Arrays;
import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��غ����� : ");
		
		String input = scan.nextLine();
		
		String[] arr = {input};
		
		System.out.println(Arrays.toString(arr));
		
		String input1 = input.replace(" ", "");
		String[] arr1 = {input1};
		System.out.println(Arrays.toString(arr1));
		
	}

}
