package sec_verify06;

import java.util.Arrays;
import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 문장을 입력해보세요 : ");
		String input1 = scan.nextLine();
		System.out.print("두 번째 문장을 입력해보세요 : ");
		String input2 = scan.nextLine();
		
		String arr1[] = {input1};
		String arr2[] = {input2};
		System.out.println("문자열1 ==> "+Arrays.toString(arr1));
		System.out.println("문자열2 ==> "+Arrays.toString(arr2));
		
		if(input1.equals(input2)) {
			System.out.println("입력한 두 문장은 같은 문장이네요.");
		}
		
		if(input1.indexOf("Java")!=-1&&input2.indexOf("Java")!=-1) {
			System.out.println("입력한 두 문장에는 Java가 포함되어있네요.");
		}
		
	}

}
