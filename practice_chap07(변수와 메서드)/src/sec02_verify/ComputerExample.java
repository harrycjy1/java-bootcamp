package sec02_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);
			Computer com = new Computer();
			
			System.out.print("1차원 배열을 만듭니다.배열수를 입력: ");
			
			int num=scan.nextInt();
			int[] values = new int[num];
			
			System.out.println("해당 배열 방에 정수를 입력하세요.");
			
			for(int i=0; i<values.length; i++) {
				System.out.print("values["+i+"] = ");
				int num2=scan.nextInt();
				values[i] = num2;
		
			}
			System.out.println("입력하신 1차원 배열의 값을 출력합니다.");
			for(int i=0; i<values.length; i++) {
				System.out.println("values["+i+"] = "+values[i]);
			}
			
			int sum = com.sum(values);//call by reference개념
									  //참조형 매개변수.
			
			System.out.println("Computer인스턴스 멤버메서드 sum을 호출한 결과는"+sum+"입니다.");
			scan.close();
	}

}
