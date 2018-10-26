package sec02_verify;

public class Exercise02 {

	public static void main(String[] args) {
		
		
		int[][] score = new int[][]{
				  {100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
						};
		int [][] result = new int[][] {};
		
		int total1=0;
		int total2=0;
		int total3=0;
		int totalsum=0;
		
		for(int i=0; i<score.length; i++) {
			total1 += score[i][0];
			total2 += score[i][1];
			total3 += score[i][2];
			int sum=0;
			
			for(int j=0; j<score[i].length; j++){
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
				
			}
			System.out.printf("%d\t%n", sum);
			totalsum += sum;
				
		}
		System.out.printf("%d\t%d\t%d\t%d",total1,total2,total3,totalsum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
