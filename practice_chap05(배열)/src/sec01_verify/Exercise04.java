package sec01_verify;

public class Exercise04 {

	public static void main(String[] args) {
		

		int score [] = new int[] {79, 88, 91, 33, 100, 55, 95};
		
		int max=score[0]; //최대값
		int min=score[0]; //최소값
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
			max=score[i];	
			} //초기값(현재 max)보다 큰 값이랑 비교될경우 그 큰값을 max로 넣어버림
		}
		System.out.println("최대값 : " +max);
		for(int i=0; i<score.length; i++) {	
			
			if(score[i]<min) {
			min=score[i];
			}//초기값(현재 min)보다 작은 값을 만나 비교할 경우 그 작은 값을 min으로 넣음
		}
		System.out.println("최소값 : " +min);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
