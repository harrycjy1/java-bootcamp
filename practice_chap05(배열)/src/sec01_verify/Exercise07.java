package sec01_verify;

import java.util.Random;

public class Exercise07 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] ball = new int[20];
		
		System.out.println("0~19번 방까지의 값 출력");
		
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
			System.out.println("ball["+i+"]= "+ball[i]);
		}
		
		for(int i=0; i<ball.length; i++) {
			int r=ran.nextInt(20);
			int tmp = ball[i];
			ball[i] = ball[r];
			ball[r] = tmp;     //1~19까지 랜덤한 수 생성후 i번째 인덱스값과 자리 교체(자리교체는 랜덤하다)
			}				   //r이 랜덤하게 생성되기 때문에
								
		
		for(int i=0; i<ball.length; i++) {
			for(int j=0; j<ball.length-1; j++) {
				
				if(ball[j]<ball[j+1]) {
					int tmp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1]=tmp; //배정된 인덱스 값들의 크기를 비교해 내림차순으로 정렬한다.
				}
			}
		
		}
		
		System.out.println();//줄바꿈
		
		System.out.println("ball배열의 앞에서부터 6개만 출력(값을 섞은 후, 내림차순 소팅한 결과)");
		for(int i=0; i<6; i++) {
			System.out.println("ball["+i+"]= "+ball[i]);
		}// i<6 앞에서 6개만 출력이므로 6번만 for문을 돌려주면 된다.
		
		
		
		

		
	}

}
