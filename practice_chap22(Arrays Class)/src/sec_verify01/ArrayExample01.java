package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("1차원 배열의 방수를 입력 : ");
		int input = scan.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] : ");
			int input1=scan.nextInt();
			arr[i]=input1;
		}
		
		System.out.println("입력하신 배열값을 출력합니다.");
		Arrays.sort(arr);
		System.out.println("arr = "+Arrays.toString(arr));
		
		System.out.print("어떤 값을 찾으십니까>>");
		int input2 = scan.nextInt();
		int index = Arrays.binarySearch(arr, input2);
	
		System.out.println(input2+"은 arr배열의 "+index+"번째 방에 있습니다.");
		
		
	}

}
