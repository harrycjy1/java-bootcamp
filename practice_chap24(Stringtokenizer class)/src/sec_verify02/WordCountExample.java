package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���. �Է��Ͻ� ������ �� �������� �и��Ǿ� ��µ˴ϴ�.\r\n" + 
				"���Ḧ ���Ͻø� exit�� �Է��Ͻø� �˴ϴ�.");

		boolean a = true;
		int i=0;
		while(a) {
		
		System.out.print("�Է� : ");
		String input = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
			
		if(input.equals("exit")) {
			System.out.println("�����մϴ�.");
			System.exit(0);	
		}
		System.out.println("������ ������ "+st.countTokens());	
		
		while(st.hasMoreTokens()) {
		System.out.println("�и��� ["+i+"]��° ���� : "+st.nextToken());
		i++;
		}
		System.out.println();
		
		
		}
		
	}

}
