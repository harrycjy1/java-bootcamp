package sec04_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Computer com = new Computer();
		Calculator cal = new Calculator();
		
		System.out.println("���ϰ��� �ϴ� ���� �������� �Է��ϼ���.");
		
		double r=scan.nextDouble();
		
		System.out.println();
		System.out.println("Calculator ��ü�� areaCircle() ����");
		System.out.println(cal.areaCircle(r));
		System.out.println();
		System.out.println("Computer ��ü�� areaCircle() ����");
		System.out.println(com.areaCircle(r));
		
		
	}

}
