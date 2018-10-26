package sec01.exam02_outputstream_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		//���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�.(������)
		OutputStream os = new FileOutputStream("D:\\test2.txt");
		
		byte [] data = "ABC������".getBytes("UTF-8");
		
		//����Ʈ�迭�� �ѹ��� ��Ʈ������ ������ ���� write�� ���� �ξ� ȿ����
		System.out.println("data ����Ʈ �迭�� ũ�� : "+data.length);
		os.write(data);
		os.flush();	//write�� ����ϸ� ������ flush�� ����
		os.close();
		
		InputStream is = new FileInputStream("D:\\test.txt");
		int readByteNo;
		byte[] readBytes = new byte[100];
		int i=0;
		//InputStream�� read(byte[] b)�޼���� ������ ���̻� ���ٸ� -1���� ������
		while((readByteNo=is.read(readBytes))!=-1) {
			i++;
			String str = new String(readBytes, "UTF-8");
			System.out.println("���� �� : "+str);
			System.out.println("���� ����Ʈ �� : "+readByteNo);
		}
		System.out.println("���� �� :" + i);
		is.close();
	}

}
