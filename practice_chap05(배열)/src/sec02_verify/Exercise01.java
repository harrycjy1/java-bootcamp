package sec02_verify;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("��� �� �Է� ");
		int input = scan.nextInt();
		
		String[][] star = new String[input][10];//10���� �ϴ� 15���� �ϴ� �������.
		
		for(int i=0,r=0; i<star.length; i++) {
			r = ran.nextInt(10)+1;
			for(int j=0; j<r; j++) {		
				star[i][j] = "*\t";//�������� ������ ������ �氹������ *\t�� ����ִ� �ڵ�
			}
		}
		
		for(int i=9; i>=0; i--) {
			if(i != 0) {
				for(int j=0; j<star.length; j++) {
					if(star[j][i]==null)
						System.out.print("\t");
					else
						System.out.print(star[j][i]);
				}
			}
			else {
				for(int j =0; j<star.length; j++) {
					System.out.print("-\t");
					
				}
				System.out.println();
				for(int j=0; j<star.length; j++) {
					System.out.print(j%10+"\t");
				}
			}
			System.out.println();
		
		}

	
	
	scan.close();
	
	}

}
