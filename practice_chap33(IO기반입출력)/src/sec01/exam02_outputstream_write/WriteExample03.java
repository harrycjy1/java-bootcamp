package sec01.exam02_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:\\test03.txt.");
		byte[] data = "ABC������".getBytes();
		
		System.out.println("data����Ʈ�迭�� ũ�� "+data.length);
		os.write(data, 1, 8);
		
		os.flush();
		os.close();
		
	}

}
