package sec_verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class binaryCopy {

	public static void main(String[] args) throws Exception{
		
		String originalpath = "D:\\����\\0823\\img.jpg";
		String copypath = "D:\\����\\0823\\���纻.jpg";
		
		File file = new File(originalpath);
		
		FileInputStream fi = new FileInputStream(originalpath);
		FileOutputStream fo = new FileOutputStream(copypath);
		
		int readbyte;
		byte[] bytes = new byte[100];
		
		while((readbyte=fi.read(bytes))!=-1) {
			fo.write(bytes);
		}
		
		System.out.println("����");
		fo.flush();
		fo.close();
		fi.close();
		

	}

}
