package sec02_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);
			Computer com = new Computer();
			
			System.out.print("1���� �迭�� ����ϴ�.�迭���� �Է�: ");
			
			int num=scan.nextInt();
			int[] values = new int[num];
			
			System.out.println("�ش� �迭 �濡 ������ �Է��ϼ���.");
			
			for(int i=0; i<values.length; i++) {
				System.out.print("values["+i+"] = ");
				int num2=scan.nextInt();
				values[i] = num2;
		
			}
			System.out.println("�Է��Ͻ� 1���� �迭�� ���� ����մϴ�.");
			for(int i=0; i<values.length; i++) {
				System.out.println("values["+i+"] = "+values[i]);
			}
			
			int sum = com.sum(values);//call by reference����
									  //������ �Ű�����.
			
			System.out.println("Computer�ν��Ͻ� ����޼��� sum�� ȣ���� �����"+sum+"�Դϴ�.");
			scan.close();
	}

}
