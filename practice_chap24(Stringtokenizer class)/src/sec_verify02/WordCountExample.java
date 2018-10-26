package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요. 입력하신 문장은 한 공백으로 분리되어 출력됩니다.\r\n" + 
				"종료를 원하시면 exit를 입력하시면 됩니다.");

		boolean a = true;
		int i=0;
		while(a) {
		
		System.out.print("입력 : ");
		String input = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
			
		if(input.equals("exit")) {
			System.out.println("종료합니다.");
			System.exit(0);	
		}
		System.out.println("낱말의 개수는 "+st.countTokens());	
		
		while(st.hasMoreTokens()) {
		System.out.println("분리된 ["+i+"]번째 낱말 : "+st.nextToken());
		i++;
		}
		System.out.println();
		
		
		}
		
	}

}
