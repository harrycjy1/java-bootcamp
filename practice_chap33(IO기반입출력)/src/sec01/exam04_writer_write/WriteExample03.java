package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample03 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("D:\\text.txt");
		char[] data = "������".toCharArray();
		
		//write()�� �Ű����� Ÿ���� ���ڹ迭�̴�. ȣ���ϰ� ���ܰ� �߻�ġ �ʾҴٸ� �������
		//���� �ڵ庸�� ���ڹ迭��ü�� �Ű������� ������ ������ �ξ� ȿ����
		writer.write(data,1,2);
	
		writer.flush();
		writer.close();
	}

}
