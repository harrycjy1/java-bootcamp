package sec02_exam;

public class Array_Example1 {

	public static void main(String[] args) {
		
		
		
		int [][] score = new int[][] {
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40}			
		};

		int sum = 0;
		System.out.println("2���� �迭�� �ּҰ� : " + score);
		
		//2���� �迭�� �����ϱ� ���� �ߺ� for���� ����ϰ� �ִ�.
		
		for(int i=0; i<score.length; i++) {
			System.out.println("1���� �迭�� �ּҰ� : "+score[i]);
			for(int j=0; j<score[i].length; j++) {
				System.out.println("score["+i+"]"+"["+j+"] =" +" "+score[i][j]);
			}
		}
		//���� for��(JDK 1.5�������� ������.
		//�Ŀ� Ŀ���������ӿ��κп��� ��ü�� �����Ҷ� �Ʒ��� ����
		//���� for���� ����մϴ�.
		
		//������ Ÿ�� ���� : ������ ���
		
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum+=i;
			}
		}
		System.out.println("sum="+sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
}
