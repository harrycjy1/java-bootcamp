package sec01_exam_constructor;

import java.util.Arrays;

public class KeyboardToString {

		//JVM���� ���ܸ� ����
	public static void main(String[] args) {
		
		byte[] bytes = new byte[100]; //�⺻�� 0���� ����
		
		//Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");

		//Ű����� �Է¹޴´�.(�Է¹��� ����Ʈ���� ����)
		
		int readByteNo;
		
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo-2); //2������ ���� ?(����Ű)
			byte[] b = str.getBytes("UTF-8"); 		//�ѱ��� 3����Ʈ
			//byte[] b = str.getBytes("EUC-KR");	//�ѱ��� 2����Ʈ
			
			
			System.out.println("String �� : "+str);
			System.out.println("byte[]�� : "+Arrays.toString(b));
			System.out.println("�Է¹��� ����Ʈ �� :"+readByteNo);
		}
		catch(Exception e) {e.printStackTrace();}
	
	
	
	
	
	
	
	
	}

}
