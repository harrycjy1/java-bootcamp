package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 
        //�Է� ��Ʈ���� ����ϰڴٰ� ScannerŬ������ ������
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("���ڸ� ������ �ϳ� �Է����ּ���>");
		
		int num=scanner.nextInt();
		System.out.printf("num=%d %n", num);
		//num���ٰ� 4����Ʈ �޸𸮰����� ����(int��)�� �ްڴ�.
		
		System.out.print("���ڸ� �Ǽ��� �ϳ� �Է����ּ���>");
		double dnum = scanner.nextDouble();
		System.out.println("dnum"+ dnum);
		//dnum���ٰ� 8����Ʈ �޸𸮰����� �Ǽ�(double��)�� �ްڴ�.
		*/
		
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���>");
		String input = scanner.nextLine();
		//����Ű�� �Է��Ҷ������� ���ڿ��� �������ִ� �޼���
		int num1 = Integer.parseInt(input);
		//�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("String���� �Է��� ���� :"+ input);
		System.out.println("input�� ������ ��ȯ�� ���� :" + num1);
		
		scanner.close();
		//���ҽ� ����(�Է½�Ʈ��)Ű���峪 ���콺 ���
		
	}
}
