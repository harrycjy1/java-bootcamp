package sec01_verify;

import java.util.Scanner;

public class Exercsie08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("화씨온도를 입력하세요 : ");
		
		int fahrenheit = scanner.nextInt();
		
		float celcius = (fahrenheit-32)/1.8f;
		
		System.out.println("입력한 화씨온도를 섭씨온도로 변환한 값 : "+ celcius);
		//소수점 둘째자리 표현방법???

	}

}
