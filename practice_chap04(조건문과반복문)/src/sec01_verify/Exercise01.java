package sec01_verify;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double weight = 0.0;
		double height = 0.0;
		double BMI = 0.0;
		
		
	System.out.println("Ű(cm)�Է� : ");
	
	
	height = scanner.nextDouble();
	
	System.out.println("������(kg) : ");
	
	weight = scanner.nextDouble();
	
	height = height/100;
	BMI = weight/(height*height);
		
	if (BMI>=20 && BMI<25) {
		System.out.println("ǥ���Դϴ�.");
	}
	
		
		
		
		
	}

}
