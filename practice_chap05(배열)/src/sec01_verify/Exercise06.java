package sec01_verify;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��Ҽ� �Է� : ");
		
		
		int input = scan.nextInt();
		
		int[] star= new int[input];
		
		for(int i=0; i<star.length; i++) {
			star[i]= rand.nextInt(10)+1;//nextint10�ϸ� 0~9�̹Ƿ� 1�����ش�
		}
		for(int i=0; i<star.length; i++) {
			System.out.print("a["+i+"] :" );
			for(int j=0; j<star[i]; j++) {  //j<star[i]������ŭ �ݺ� �ؼ� ���� ������
				System.out.print("*");
			}
		System.out.println();//�ٹٲ�
		}
		
		
		
	}

}
