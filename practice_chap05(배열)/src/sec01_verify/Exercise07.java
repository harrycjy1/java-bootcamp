package sec01_verify;

import java.util.Random;

public class Exercise07 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] ball = new int[20];
		
		System.out.println("0~19�� ������� �� ���");
		
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
			System.out.println("ball["+i+"]= "+ball[i]);
		}
		
		for(int i=0; i<ball.length; i++) {
			int r=ran.nextInt(20);
			int tmp = ball[i];
			ball[i] = ball[r];
			ball[r] = tmp;     //1~19���� ������ �� ������ i��° �ε������� �ڸ� ��ü(�ڸ���ü�� �����ϴ�)
			}				   //r�� �����ϰ� �����Ǳ� ������
								
		
		for(int i=0; i<ball.length; i++) {
			for(int j=0; j<ball.length-1; j++) {
				
				if(ball[j]<ball[j+1]) {
					int tmp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1]=tmp; //������ �ε��� ������ ũ�⸦ ���� ������������ �����Ѵ�.
				}
			}
		
		}
		
		System.out.println();//�ٹٲ�
		
		System.out.println("ball�迭�� �տ������� 6���� ���(���� ���� ��, �������� ������ ���)");
		for(int i=0; i<6; i++) {
			System.out.println("ball["+i+"]= "+ball[i]);
		}// i<6 �տ��� 6���� ����̹Ƿ� 6���� for���� �����ָ� �ȴ�.
		
		
		
		

		
	}

}
