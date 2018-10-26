package sec01_exam;

public class Array_Example01 {

	public static void main(String[] args) {
		
		
		//int 형 배열명 score(참조변수)에 int[5]바잍 생성후, 주소값 넘김.
		int[] score = new int[10];
		int k=1;
	
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		score[9]=1500;
		//score:int[] 주소값을 저장(참조형)
		//score[i] 실제값을 의미 (기본형)
		
		int tmp = score[k+2]+score[4];
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] :"+score[i]);
		}
		System.out.println("tmp : "+tmp);
		System.out.println("score[7]"+score[9]);
		//score[7]의 경우 값을 주지않아서 최초의 0초기화 그대로 출력
		System.out.println(score);
		System.out.println(score.length);//배열의 길이

	}

}
