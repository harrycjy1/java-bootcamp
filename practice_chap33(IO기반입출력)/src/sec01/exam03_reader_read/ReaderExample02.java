package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample02 {

	public static void main(String[] args) throws Exception{
		//Reader�� ���� Ŭ������ FileReader�� �����Ͽ� ����
		Reader reader = new FileReader("D:\\text.txt");
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		//�Ʒ��� ���� StringBuilderŬ������ ����ص� �ȴ�
		//StringBuilder sb = new StringBuilder();
		
		//read()�� �Ű�\Ÿ���� char�迭
		while((readData=reader.read(cbuf))!=-1) {
			//sb.append(cbuf)
			data+= new String(cbuf,0,readData);
			System.out.println("���� ���� �� : "+readData); //�����ڵ� ���
		}
		System.out.println(data);
		//System.out.println(sb);
		reader.close();
	}

}
