package sec01_exam;

public class Array_Example02 {
//Ŭ��������
	
	
	
	
	public static void main(String[] args) {
	//�޼��念��
		
		
		int sum=0;
		float average=0.0f;
		
		int[] score= new int[] {100,88,100,100,90};
		//����� ���ÿ� �ʱ�ȭ
		
		System.out.println("�迭�� ���� : "+ score.length);
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}//�迭�� ����
		
		
		average = (float)sum/score.length;
		//������ int�� ������ float ���ε� ���ϴ°��� float������ ��� ���ؼ� float�� ĳ����
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
		

	}

}
