package sec01_verify;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double weight = 0.0;
		double height = 0.0;
		double BMI = 0.0;
		
		
	System.out.println("키(cm)입력 : ");
	
	
	height = scanner.nextDouble();
	
	System.out.println("몸무게(kg) : ");
	
	weight = scanner.nextDouble();
	
	height = height/100;
	BMI = weight/(height*height);
		
	if (BMI>=20 && BMI<25) {
		System.out.println("표준입니다.");
	}
	
		
		
		
		
	}

}
