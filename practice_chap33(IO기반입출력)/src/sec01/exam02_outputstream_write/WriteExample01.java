package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {
	public static void main(String[] args) throws Exception {

	//���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�.
	OutputStream os = new FileOutputStream("D:\\test.txt");
	
	byte[] data = "ABC".getBytes();

	System.out.println(Arrays.toString(data));
	
	for(int i=0; i<data.length; i++) {
		os.write(data[i]);
	}
	
	//write()�� ����ϸ� ������ flush()�� ȣ���Ͽ� �޸𸮹��۸� ��쵵�� ����
	//���� main�� �����ϸ� �˾Ƽ� ������� �����ϸ� flush�� ����
	
	os.flush();
	os.close();
	
	}
}
