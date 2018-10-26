package sec01_exam;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String position = null;
		
		System.out.print("직급을 입력하세요 >>");
		
		position = scanner.nextLine();
		
		//보통 switch문의 값은 int 이하의 정수값을 지니지만, 유일하게 string 클래스 타입은 허용한다.
		
		switch(position) {
		case"부장":
			System.out.println("500만원");
			break;
		case"차장":
			System.out.println("400만원");
			break;
		case"과장":
			System.out.println("350만원");
			break;
		case"대리":
			System.out.println("250만원");
			break;
		case"사원":
			System.out.println("150만원");
			break;
		default:
			System.out.println("300만원");
		}
		
	}

}
