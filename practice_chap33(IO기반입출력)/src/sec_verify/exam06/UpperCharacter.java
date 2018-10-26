package sec_verify.exam06;

import java.io.File;
import java.io.FileReader;

public class UpperCharacter {

	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("D:\\¼÷Á¦\\0823\\sample.txt");
		int dataNo;
		
		
		char[] cbuf = new char[100];
		
		while((dataNo=file.read(cbuf))!=-1) {
			String str= new String(cbuf,0,dataNo);
			
			System.out.println(str.toUpperCase());
		}
		file.close();
		

	}

}
