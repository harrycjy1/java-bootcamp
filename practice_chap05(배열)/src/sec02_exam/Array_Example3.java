package sec02_exam;

import java.util.Scanner;

public class Array_Example3 {

	public static void main(String[] args) {
		
		String[][] words = new String[][] {
			{"chair"	,"����"},
			{"computer"	,"��ǻ��"},
			{"integer"	,"����"}
		};
		
		//���α׷��� �ڵ��� ��, ���ҽ�(Resource)��� Ī�ϴ� ����
		//�����, Ű����, ���콺, ���� ��
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			//%s�� ���ڿ��� ��Ÿ���� �����������̴�.
			System.out.printf("Q%d, %s�� ����?", i+1, words[i][0]);
			//nextLine()�޼���� ����ڰ� ���͸� ĥ������ �Է¹޴´�.
			//next() ������ ����� �ű������ ���� �޴´�.
			
			String tmp = scan.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
			}
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);
			}
		
		
		}

		scan.close();
	}

}
