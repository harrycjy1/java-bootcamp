package sec04.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("입력 : ");
		//보통, BufferedReader보조스트림은 readLine()을 사용하기 위해 많이 사용된다.
		String linestring = br.readLine();
		System.out.println("출력 : "+linestring);
		
		//자원 해제
		br.close();
		reader.close();
		is.close();
		
				

	}

}
