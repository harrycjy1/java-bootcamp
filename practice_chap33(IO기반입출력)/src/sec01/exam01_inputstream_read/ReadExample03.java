package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample03 {

	public static void main(String[] args) throws Exception{
		
		//EOF = -1 (End of File)
		InputStream is = new FileInputStream("D:\\test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes);
		
		for(Byte b: readBytes) 
			System.out.println("읽은 바이트 : "+b);
			
		
	
		is.close();
	}

}
