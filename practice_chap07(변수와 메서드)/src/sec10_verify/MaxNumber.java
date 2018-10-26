package sec10_verify;

public class MaxNumber {

	
	
	public int 	max(int[] arr) {
		int result = 0;
		if(arr==null||arr.length==0) {
			result=-999999;
			System.out.println(result);
		}
		else {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length-1; j++) {
				int tmp = 0;
				if(arr[j]<arr[j+1]) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
			result = arr[0];
			System.out.println("배열의 최대값 : "+result);
		
		}
			return result;
	
	}
	
	
}
