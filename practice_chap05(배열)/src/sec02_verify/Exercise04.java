package sec02_verify;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
	int[][] score = new int [6][2];
	double[] avg = new double[6];
			
			Scanner scan = new Scanner(System.in);
			
			int sumkor = 0;
			double avgkor = 0;
			int summath=0;
			double avgmath=0;
			
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"��° �������� �Է� : ");
			score[i][0] = scan.nextInt();
			
			sumkor += score[i][0];
			avgkor = (double)sumkor/score.length;
			
			System.out.print((i+1)+"��° �������� �Է� : ");
			score[i][1] = scan.nextInt();
			
			summath +=score[i][1];
			avgmath =(double) summath/score.length;
			
			avg[i] = (double)(score[i][0]+score[i][1])/score[i].length;
			
		}
			 
		System.out.println("-----------------------");
		System.out.println("���� ��� : "+ avgkor);
		System.out.println("���� ��� : "+ avgmath);
		System.out.println("-----------------------");
		
		for (int i=0; i<score.length; i++) {
			System.out.println(i+"���� �л��� ���: "+ avg[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
