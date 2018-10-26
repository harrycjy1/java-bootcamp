package sec_verify.exam07;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		
		File file = new File("D:\\");
		
		long m = 0;
		
		File maxfile = null;
		
		for(File f : file.listFiles()) {
			
			if(m<f.length()) {
			m=f.length();
			maxfile=f;
			}
			if(f.isFile()==true)
			System.out.println(f.getName());
			
			
		}
		System.out.println("가장 큰 파일은 D:\\"+maxfile.getName()+" "+m+"바이트");
		
		
	}

}
