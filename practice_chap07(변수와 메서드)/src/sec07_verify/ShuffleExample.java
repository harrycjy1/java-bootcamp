package sec07_verify;

import java.util.Arrays;

public class ShuffleExample {

	public static void main(String[] args) {

		int[] original = { 1,2,3,4,5,6,7,8,9 };
		
		System.out.println("배열값을 섞기 전 상태입니다.");
		System.out.println(Arrays.toString(original));
		
		ShuffleClass.shuffle(original);
		
		
		

	}

}
