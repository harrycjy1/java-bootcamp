package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample03 {

	public static void main(String[] args) throws Exception{
		//Reader�� ����Ŭ������ FileReader�� �����Ͽ� ����
		
		Reader reader = new FileReader("D:\\test.txt");
		char[] cbuf = new char[4];
		
		int readData =  reader.read(cbuf,1,2);
		
		System.out.println("���� ���� �� : "+readData);
		
		//��°���� 0 �ε����� �׳� ������ ������ 2,3 �ε����� �մ°͸� �д°��� �˼����ִ�.
		for(int i=0; i<cbuf.length; i++) 
			System.out.println(i+"��° ���� : "+cbuf[i]);
		
		
		reader.close();

	}

}
