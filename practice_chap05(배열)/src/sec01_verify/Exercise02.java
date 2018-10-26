package sec01_verify;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소수입력 :");
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			int r =(int)(Math.random()*10)+1;//난수 생성 다른코드도 알아보자
			
				arr[i]=r;//배열 arr[]에 r값을 대입 for문 안에서 써야 반복대입한다!
			System.out.println("arr["+i+"] : "+arr[i]);
			
		}
			
	}

}
