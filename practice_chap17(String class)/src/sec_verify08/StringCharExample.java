package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("���ڿ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� �����մϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = scan.nextLine();
		
		char[] arr = input.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			if(Character.isUpperCase(arr[i])) {
				arr[i]=Character.toLowerCase(arr[i]);
			}
			else {
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}	
		
		System.out.println("��ȯ�� ���ڿ� ==>"+String.valueOf(arr));
		
		
		
		/*for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}*/
		
		
	}

}
