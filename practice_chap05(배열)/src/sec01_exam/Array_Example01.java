package sec01_exam;

public class Array_Example01 {

	public static void main(String[] args) {
		
		
		//int �� �迭�� score(��������)�� int[5]�ٟ� ������, �ּҰ� �ѱ�.
		int[] score = new int[10];
		int k=1;
	
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		score[9]=1500;
		//score:int[] �ּҰ��� ����(������)
		//score[i] �������� �ǹ� (�⺻��)
		
		int tmp = score[k+2]+score[4];
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] :"+score[i]);
		}
		System.out.println("tmp : "+tmp);
		System.out.println("score[7]"+score[9]);
		//score[7]�� ��� ���� �����ʾƼ� ������ 0�ʱ�ȭ �״�� ���
		System.out.println(score);
		System.out.println(score.length);//�迭�� ����

	}

}
