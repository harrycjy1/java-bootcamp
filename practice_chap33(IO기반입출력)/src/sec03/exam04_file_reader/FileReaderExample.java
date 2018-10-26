package sec03.exam04_file_reader;

import java.io.File;
import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) throws Exception{
		//file객체를 생성하여 FileWriter생성자 매개값으로 줌.
		File file= new File("D:/example/readerfile.txt");
		//true가 붙어있기 때문에 기존 파일에 append가 된다. 없다면 덮어쓰게 된다.
		FileWriter fw = new FileWriter(file,true);
		
		fw.write("FileWriter는 한글로된 "+"\r\n");
		fw.write("문자열을 바로 출력할수 있다."+"\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("파일에 저장되었습니다.");

	}

}
