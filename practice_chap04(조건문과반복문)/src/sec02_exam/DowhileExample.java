package sec02_exam;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		String inputString = null;
		
		//do-while ���� �ּ� �ѹ��� ������ �����Ѵ�. ������ ������ �ڿ� �ֱ� �����̴�.
		//(while���� ������)
		
		do {
			System.out.println(">");
			//Scanner Ŭ������ nextLine�� ����ĥ�������� ���������Ͽ� String���� ����,
			//next�� ���鸸�� �������� ����
		inputString=scan.nextLine().trim();
		//trim() string ���� ���Ե� ������ ��������
		
		System.out.println(inputString);
	
		} while(!inputString.equals("q")); //q�� �Է��ϸ� ������ false �̹Ƿ� ���� ��������
		
		System.out.println();
		System.out.println("���α׷� ����");
		
		scan.close();
		
		

	}

}
