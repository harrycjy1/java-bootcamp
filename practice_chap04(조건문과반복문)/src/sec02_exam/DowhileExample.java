package sec02_exam;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		String inputString = null;
		
		//do-while 문은 최소 한번은 무조건 실행한다. 이유는 조건이 뒤에 있기 때문이다.
		//(while과의 차이점)
		
		do {
			System.out.println(">");
			//Scanner 클래스의 nextLine은 엔터칠때까지의 공백포함하여 String으로 리턴,
			//next는 공백만날 때까지만 리턴
		inputString=scan.nextLine().trim();
		//trim() string 값에 포함된 공백을 제거해줌
		
		System.out.println(inputString);
	
		} while(!inputString.equals("q")); //q를 입력하면 조건이 false 이므로 루프 빠져나감
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		scan.close();
		
		

	}

}
