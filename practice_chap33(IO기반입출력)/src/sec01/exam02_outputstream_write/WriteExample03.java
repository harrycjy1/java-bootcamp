package sec01.exam02_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:\\test03.txt.");
		byte[] data = "ABC가나다".getBytes();
		
		System.out.println("data바이트배열의 크기 "+data.length);
		os.write(data, 1, 8);
		
		os.flush();
		os.close();
		
	}

}
