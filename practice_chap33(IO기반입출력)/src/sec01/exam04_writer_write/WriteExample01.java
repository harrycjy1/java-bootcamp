package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("D:\\text.txt");
		char[] data = "ȫ�浿".toCharArray();
		
		for(int i=0; i<data.length; i++) {
			//write()�� ȣ���ϰ� ���ܰ� �߻�ġ �ʾҴٸ� ���������� ������ �Ȱ��̴�.
			writer.write(data[i]);
			System.out.println("���μ� : "+i);
		}
		writer.flush();
		writer.close();
	}

}
