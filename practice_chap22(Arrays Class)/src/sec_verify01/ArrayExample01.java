package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("1���� �迭�� ����� �Է� : ");
		int input = scan.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] : ");
			int input1=scan.nextInt();
			arr[i]=input1;
		}
		
		System.out.println("�Է��Ͻ� �迭���� ����մϴ�.");
		Arrays.sort(arr);
		System.out.println("arr = "+Arrays.toString(arr));
		
		System.out.print("� ���� ã���ʴϱ�>>");
		int input2 = scan.nextInt();
		int index = Arrays.binarySearch(arr, input2);
	
		System.out.println(input2+"�� arr�迭�� "+index+"��° �濡 �ֽ��ϴ�.");
		
		
	}

}
