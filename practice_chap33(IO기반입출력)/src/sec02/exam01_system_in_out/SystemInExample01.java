package sec02.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample01 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("==메뉴==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요 :");
		
		//키보드로 부터 입력을 받기 위해 System.in필드를 Inputstream에 대입
		
		InputStream is = System.in;
		
		//한바이트를 읽는다 다시 얘기 하지만 int값의 마지막 1바이트를 받는 것이다.
		int inputInt = is.read();
		System.out.println("키보드로부터 입력된 아스키코드 : "+ inputInt);
		
		char inputChar = (char)inputInt;//아스키 코드를 문자타입으로 보기위해 강제 타입 변환
		
		//실행시 이클립스의 콘솔과 명령 프롬프트에서 실행을 해보자.
		//(네비게이터의 bin폴더의 경로를 속성에서 복사 후 패키지와 파일명을 입력하도록 하자.
		
		
		switch(inputChar) {
		case '1':
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("예금 출금을 선택하셨습니다.");
			break;
		case '3':
			System.out.println("예금 입금을 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료 하기를 선택하셨습니다.");
			break;
		}
	}
}
