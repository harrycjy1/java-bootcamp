package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 : ");
		
		int second2 = scanner.nextInt();
		
		int second = second2%60;
		int minute = second2/60;
		int hour = minute/60;
		int time = hour/60;
		
		System.out.println("1000초는 "+time+"시간, " +minute +"분, " + second + "초 입니다.");
		
		

		
		

	}

}
