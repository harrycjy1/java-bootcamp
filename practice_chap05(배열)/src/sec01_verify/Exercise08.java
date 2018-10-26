package sec01_verify;

import java.util.Arrays;
import java.util.Random;

public class Exercise08 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("출력되는 값은 code배열에 있는 값으로만 구성됨");
		System.out.println("배열값 출력");
		
		int[] code = new int[] {-9,-55,73,116,101,205,1000};
		int[] arr= new int[10]; //문제 조건
		
		
		for(int i=0; i<arr.length; i++) {
			int r=ran.nextInt(7); //code의 배열길이가 7까지 이므로 7까지의 랜덤수 발생시킨다.
			arr[i]=code[r]; //랜덤수에 대입되는 code배열값을 arr배열값에 차례로 박아넣는다.
		}
			
		System.out.println(Arrays.toString(arr));
		//tostring 메서드써야 [배열값,배열값...]으로 출력	
		
				
			
		
		
		
		
		
		
		
		
		
	}

}
