package sec_verify.exam03;

import java.io.FileReader;
import java.io.Reader;

public class HangulExample {

	public static void main(String[] args) throws Exception{
		
		Reader reader = new FileReader("D:\\text.txt");
		int readData;
		char[] cbuf = new char[100];
		String str = "";
		
		while((readData=reader.read(cbuf))!=-1) {
			str += new String(cbuf,0,readData);
		}
		System.out.println(str);
		reader.close();

	}

}
