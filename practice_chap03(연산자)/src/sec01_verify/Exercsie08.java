package sec01_verify;

import java.util.Scanner;

public class Exercsie08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("ȭ���µ��� �Է��ϼ��� : ");
		
		int fahrenheit = scanner.nextInt();
		
		float celcius = (fahrenheit-32)/1.8f;
		
		System.out.println("�Է��� ȭ���µ��� �����µ��� ��ȯ�� �� : "+ celcius);
		//�Ҽ��� ��°�ڸ� ǥ�����???

	}

}
