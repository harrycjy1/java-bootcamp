package sec01_verify;

import java.util.Arrays;

public class Exercise13 {

	public static void main(String[] args) {
		
		int[] arr= new int[10];
		int max=0;
		int number = 0;
		for(int i=1; i<=100; i++) {
			int num=(int)(Math.random()*10);
			System.out.printf((i%10!=0)?"%3d":"%3d\n",num);//출력되는 방식이 네모 형태로 깔끔하게 하기 위해 사용
														   //문제를 푸는데는 println을 사용해 죽 나열해도 상관은 없음.
			
			arr[num]++;//가장 중요한 카운팅					  	
			
		}
		
		System.out.println(Arrays.toString(arr));
		//arr[i]=n i숫자가 n번 생성되었다는 뜻으로 해석가능
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				number=i;
			}//결국 arr[i] 최대값을 찾는다는건 최대 n번 생성된 수를 찾는다는 뜻이고,
		}	 //가장 큰 arr[i]값을 가지는 i는 그 n번 생성된 수를 의미한다.
		
		System.out.printf("가장 많이 생성된 수는 : %d로 %d개 입니다.:",number,max);
		
		
		
		
		
		
		

	}

}
