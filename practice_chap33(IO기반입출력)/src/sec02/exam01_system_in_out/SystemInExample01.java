package sec02.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample01 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("==�޴�==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ��� :");
		
		//Ű����� ���� �Է��� �ޱ� ���� System.in�ʵ带 Inputstream�� ����
		
		InputStream is = System.in;
		
		//�ѹ���Ʈ�� �д´� �ٽ� ��� ������ int���� ������ 1����Ʈ�� �޴� ���̴�.
		int inputInt = is.read();
		System.out.println("Ű����κ��� �Էµ� �ƽ�Ű�ڵ� : "+ inputInt);
		
		char inputChar = (char)inputInt;//�ƽ�Ű �ڵ带 ����Ÿ������ �������� ���� Ÿ�� ��ȯ
		
		//����� ��Ŭ������ �ְܼ� ��� ������Ʈ���� ������ �غ���.
		//(�׺�������� bin������ ��θ� �Ӽ����� ���� �� ��Ű���� ���ϸ��� �Է��ϵ��� ����.
		
		
		switch(inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
			break;
		case '2':
			System.out.println("���� ����� �����ϼ̽��ϴ�.");
			break;
		case '3':
			System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
			break;
		case '4':
			System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
			break;
		}
	}
}
