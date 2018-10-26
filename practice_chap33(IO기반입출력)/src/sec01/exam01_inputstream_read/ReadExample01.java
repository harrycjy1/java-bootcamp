package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample01 {

	public static void main(String[] args) throws Exception{
		 //\�� �̽������� ���ڷν� ��θ� �Է½� \\�� �ϴ��� �ƴϸ�, /�� �����ָ� �ȴ�.
		//�̽��������� � ��ȣ �Ǵ� ���κ��� ��Ż�ϴ� ��. ��, ������ �������κ��� Ż���ϴ� 
		//���� ���Ѵ�.
		//�ƽ�Ű ���� ������ 27��° ������ �̸��̴�. 
		
		//������ ���� ���� �߻� �� �� ������ JVM���� ����.
		//InputStream is = new FileInputStream("C:\\test.txt");
		//������ ���� ���� �߻� �� �� ������ JVM���� ����.
		InputStream is = new FileInputStream("D:\\test1.txt");
		int readByte;
		
		//InputStream�� read()�޼���� ������ ���̻� ���ٸ�,
		//-1���� ������.(�ѱ��� 2����Ʈ�� �ؼ���)
		while( (readByte = is.read() ) != -1) {
//			System.out.println("���� ����Ʈ : " + readByte); //�ƽ�Ű�ڵ尪 ���
			//�ƽ�Ű�ڵ尪 ���(�ѱ��� ����. �ֳ� �ѱ���2����Ʈ �̴ϱ�)
//			System.out.println("���� ���� : " + (char)readByte);
			System.out.print((char)readByte);
		}
		
		//�Ʒ��� ���� �ۼ��ص� �ȴ�. ������� �Ͻø� �˴ϴ�.
//		while(true) {
//			readByte = is.read();
//			if(readByte == -1) //�о��ٸ� -1�� �������� ���� ���̴�.
//				break;
//			System.out.println("���� ����Ʈ : " + readByte); //�ƽ�Ű�ڵ尪 ��� 
//		}
		is.close();
	}

}