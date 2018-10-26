package sec07_verify;

import java.util.Arrays;

public class ShuffleClass {

		
	 
	 
	 static int[] shuffle (int[] arr) {
		 System.out.println("배열값을 섞은 후 상태입니다.");
		 for(int i=0; i<arr.length; i++) {
			
			 int r = (int)(Math.random()*9);
				 int temp = arr[i];
				  arr[i] = arr[r];
				  arr[r] = temp;
			 
		 }
		 System.out.println(Arrays.toString(arr));
		 return arr;
	 	}
	 		
	
	
	
}
