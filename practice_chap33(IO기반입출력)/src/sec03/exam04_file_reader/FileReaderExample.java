package sec03.exam04_file_reader;

import java.io.File;
import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) throws Exception{
		//file��ü�� �����Ͽ� FileWriter������ �Ű������� ��.
		File file= new File("D:/example/readerfile.txt");
		//true�� �پ��ֱ� ������ ���� ���Ͽ� append�� �ȴ�. ���ٸ� ����� �ȴ�.
		FileWriter fw = new FileWriter(file,true);
		
		fw.write("FileWriter�� �ѱ۷ε� "+"\r\n");
		fw.write("���ڿ��� �ٷ� ����Ҽ� �ִ�."+"\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");

	}

}
