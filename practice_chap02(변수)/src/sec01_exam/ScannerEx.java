package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 
        //입력 스트림을 사용하겠다고 Scanner클래스를 생성함
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("두자리 정수를 하나 입력해주세요>");
		
		int num=scanner.nextInt();
		System.out.printf("num=%d %n", num);
		//num에다가 4바이트 메모리공간에 정수(int형)를 받겠다.
		
		System.out.print("두자리 실수를 하나 입력해주세요>");
		double dnum = scanner.nextDouble();
		System.out.println("dnum"+ dnum);
		//dnum에다가 8바이트 메모리공간에 실수(double형)를 받겠다.
		*/
		
		System.out.print("원하는 숫자를 입력하세요>");
		String input = scanner.nextLine();
		//엔터키를 입력할때까지의 문자열을 리턴해주는 메서드
		int num1 = Integer.parseInt(input);
		//입력받은 문자열을 숫자로 변환
		
		System.out.println("String으로 입력한 내용 :"+ input);
		System.out.println("input을 정수로 변환한 내용 :" + num1);
		
		scanner.close();
		//리소스 해제(입력스트림)키보드나 마우스 등등
		
	}
}
