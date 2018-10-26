package sec10_verify;

import java.util.Arrays;

public class MaxNumberExample {

	public static void main(String[] args) {
		
		int[] a=new int[] {23,72,9,54,1747};
		
		System.out.println("현재 배열 상태입니다.\n"+Arrays.toString(a));
		
		MaxNumber max = new MaxNumber();
		
		max.max(a);
		
		//0인 크기의 배열을 줬을때
		int[] b=new int[0];
		
		System.out.println("크기가 0인 배열의 주소를 줬을 때");
		max.max(b);
		
		//null값을 줬을때
		int[] c=null;
		System.out.println("null값을 줬을때");
		max.max(null);
		

	}

}
