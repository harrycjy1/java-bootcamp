package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample02 {

	public static void main(String[] args) throws Exception{
		 InputStream is = new FileInputStream("D:\\test1.txt");
		 int readByteNo;
		 int i=0;
		 byte[] readBytes = new byte[2];
		 //InputStream�� read(byte[] b)�޼���� ������ ���̻� ���ٸ�,
		 //-1���� ������
		 while( (readByteNo = is.read(readBytes) ) != -1) {
			 //���� ����Ʈ �� ����
			 System.out.println("���� ����Ʈ�� �� : " +  readByteNo);
			 //���ڿ��� ���ڵ���
			 String str = new String(readBytes,0,readByteNo);
			 //�Ʒ��� ���� �ϸ�, 5����Ʈ �����̹Ƿ� 2��° ������ �� ������
			 //�����ʹ� ���� ������ ���������Ͱ� ��µȴ�.
			 //String str = new String(readBytes);
			 System.out.println("���� ���ڿ� : " + str);//���ڿ� ���
//			 System.out.println(str); //���ڿ� ���
			 i++;
		 }
		 System.out.println("���� �� : " + i); //���ڿ� ���
		 
		 //�Ʒ��� ���� �ۼ��ص� �ȴ�.
		 while(true) {
			 int readByte = is.read();
			 if(readByte == -1) //�о��ٸ� -1�� �������� ���� ���̴�.
				 break;
			 System.out.println("���� ����Ʈ : " + readByte); //�ƽ�Ű�ڵ� ���
		 }
		 is.close();
	}

}