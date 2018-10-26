
package sec02_verify;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("반수 : ");
		int input1 = scan.nextInt();
		
		int[][] classarr = new int[input1][];
		
		int sum,totalsum=0;
		double avg,totalavg=0;
		
		
		
		for(int i=0; i<classarr.length; i++) {
			System.out.print((i+1)+ "반의 인원 : ");
			int input2 = scan.nextInt();
			classarr[i]=new int[input2];
				for(int j=0; j<classarr[i].length; j++) {
					System.out.print((i+1)+"반 "+(j+1)+"번의 점수 : ");
					classarr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("반\t합계\t평균");
		System.out.println("---------------------");
		
		for(int i=0; i<classarr.length; i++) {
			sum=0;
			for(int j=0; j<classarr[i].length; j++) {
				sum += classarr[i][j];
			}
				totalsum += sum;
				
				avg = (double)sum/classarr[i].length;
				totalavg += avg;
				System.out.println(i+1+"반\t"+sum+"\t"+avg);
		}
		System.out.println("---------------------");
		totalavg = totalavg/classarr.length;
		System.out.println("계\t"+totalsum+"\t"+totalavg);
		
		
	}

}
