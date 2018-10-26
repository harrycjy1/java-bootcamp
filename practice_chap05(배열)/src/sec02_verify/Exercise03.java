package sec02_verify;

public class Exercise03 {

	public static void main(String[] args) {
		
		int[][] score = new int[][]{
			  	{ 88, 95, 100},
				{ 85, 63, 20},
				{ 34, 30, 30},
				{ 40, 49, 70},
				{ 15, 75, 98},
			};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d\t",i+1);
			int sum=0;
			float avg=0;
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
				sum += score[i][j];
				avg = (float)sum/score[i].length;
			
			}
			System.out.printf("%d\t%.1f%n",sum,avg);
			
		}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
