package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample01 {

	public static void main(String[] args) throws Exception{
		// Reader�� ���� Ŭ������ FileReader�� �����Ͽ� �����ϰ� �ִ�
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		//readData�� int������ �� 2����Ʈ(���ڴ� 2����Ʈ)�� ����ȴ�.
		while((readData=reader.read())!=-1) {
			//�������(����Ʈ������ ���� ĳ����)
			System.out.println("���� ���� : "+(char)readData);
			System.out.println("���� ���� : "+readData); //�����ڵ����
		}
		
		//�Ʒ��� ���� �ۼ��ص� ��
		/*while(true) {
			readData = reader.read();
			if(readData==-1)
				break;
			
			System.out.println("���� ���� : "+(char)readData);
			System.out.println("���� ���� : "+readData); //�����ڵ����
		}*/
		reader.close(); //�ڿ� ����
	}

}
