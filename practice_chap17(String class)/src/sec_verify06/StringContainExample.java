package sec_verify06;

import java.util.Arrays;
import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��غ����� : ");
		String input1 = scan.nextLine();
		System.out.print("�� ��° ������ �Է��غ����� : ");
		String input2 = scan.nextLine();
		
		String arr1[] = {input1};
		String arr2[] = {input2};
		System.out.println("���ڿ�1 ==> "+Arrays.toString(arr1));
		System.out.println("���ڿ�2 ==> "+Arrays.toString(arr2));
		
		if(input1.equals(input2)) {
			System.out.println("�Է��� �� ������ ���� �����̳׿�.");
		}
		
		if(input1.indexOf("Java")!=-1&&input2.indexOf("Java")!=-1) {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ��ֳ׿�.");
		}
		
	}

}
