package sec06_verify;

import java.util.Scanner;

public class GoodCalcExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		GoodCalc cal = new GoodCalc();
		
		System.out.println("�� ���� (2,3)�� �� : "+cal.add(2, 3));
		System.out.println("�� ���� (2,-13)�� ���� :"+cal.subtract(2, -13));
		
		System.out.print("��� ���� ������?");
		int input = scan.nextInt();
		
		int[] ab = new int[input];
		for(int i=0; i<input; i++) {
			System.out.print((i+1)+"��° �� : ");
			int input2 = scan.nextInt();
			ab[i]=input2;
		}

		System.out.printf("�迭(%d, %d, %d)�� ��� : %.2f",ab[0],ab[1],ab[2],cal.average(ab));
	}

}
