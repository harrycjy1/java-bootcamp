package sec01_verify;

public class Exercise04 {

	public static void main(String[] args) {
		

		int score [] = new int[] {79, 88, 91, 33, 100, 55, 95};
		
		int max=score[0]; //�ִ밪
		int min=score[0]; //�ּҰ�
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
			max=score[i];	
			} //�ʱⰪ(���� max)���� ū ���̶� �񱳵ɰ�� �� ū���� max�� �־����
		}
		System.out.println("�ִ밪 : " +max);
		for(int i=0; i<score.length; i++) {	
			
			if(score[i]<min) {
			min=score[i];
			}//�ʱⰪ(���� min)���� ���� ���� ���� ���� ��� �� ���� ���� min���� ����
		}
		System.out.println("�ּҰ� : " +min);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
