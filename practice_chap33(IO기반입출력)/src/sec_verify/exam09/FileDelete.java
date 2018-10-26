package sec_verify.exam09;

import java.io.File;
import java.io.FileFilter;


public class FileDelete implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		
		return pathname.getName().endsWith(".txt");
	}
	
	
	public static void main(String[] args) {
		
		FileDelete fd = new FileDelete();
		File file = new File("D:\\example\\");
		
		
		for(File f : file.listFiles(fd)) {
			System.out.println(f.getName());
			f.delete();
		}

	}

}
