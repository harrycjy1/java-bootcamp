package sec04.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("�Է� : ");
		//����, BufferedReader������Ʈ���� readLine()�� ����ϱ� ���� ���� ���ȴ�.
		String linestring = br.readLine();
		System.out.println("��� : "+linestring);
		
		//�ڿ� ����
		br.close();
		reader.close();
		is.close();
		
				

	}

}
