package sec02_exam;

public class Array_Example2 {

	public static void main(String[] args) {
		

		int[][] score = new int[][] {
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40},
			{50,50,50}
		};
	//���� ����
		
		int korTotal =0;
		int engTotal =0;
		int mathTotal =0;
	
		int totalsum =0;
		
		float avgsum=0.0f;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t��� ");
		System.out.println("=============================================");
		for(int i=0; i<score.length; i++) {
			int sum = 0;	//���κ� ����
			float avg=0.0f;	//���κ� ���
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%3d",i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("\t%d", score[i][j]);
			}
			totalsum += sum;
			avg=(float)sum/score[i].length;
			avgsum += avg;
			System.out.printf("\t%d \t%.2f%n", sum, avg);
		}
		
		avgsum /= (float)score.length;
		System.out.println("=============================================");
		System.out.printf("����\t%d\t%d\t%d\t%d\t%.2f",korTotal,engTotal,mathTotal,totalsum,avgsum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
