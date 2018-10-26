package sec04_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Computer com = new Computer();
		Calculator cal = new Calculator();
		
		System.out.println("구하고자 하는 원의 반지름을 입력하세요.");
		
		double r=scan.nextDouble();
		
		System.out.println();
		System.out.println("Calculator 객체의 areaCircle() 실행");
		System.out.println(cal.areaCircle(r));
		System.out.println();
		System.out.println("Computer 객체의 areaCircle() 실행");
		System.out.println(com.areaCircle(r));
		
		
	}

}
