package sec03.exam02_file_input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream(dfjkfjdfk);
		// \는 이스케이프문자이기때문에 아래와 같이 /로 바꿔준다
		//현재 소스코드를 콘솔에 출력해보는 프로그램이다.
		
		try {
			FileInputStream fis = new FileInputStream("D:\\java 작업 조진영\\practice_chap33(IO기반입출력)\\src\\sec03\\exam02_file_input_stream\\FileInputStreamExample.java");
			
			int data;
			int i=0;
			
			//한바이트 씩 읽는다
			
			while((data = fis.read())!= -1) {
				//콘솔 출력(원래 System.out.println을 해야하나,
				//어차피 출력스트림이므로write()써도 무방
				System.out.write(data);
				
				//콘솔출력 system.out.print()사용, 한글은 2바이트이기대문에 깨진다. 그렇기 떄문에 바이트배열로 하는것이 현명하다
				//system.out.print((char)data);
				i++;
			}
			System.out.println("루핑 수 : "+i);
			fis.close();
		} catch (Exception e) {e.printStackTrace();}

	}

}
