package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample03 {

	public static void main(String[] args) throws Exception{
		//Reader의 하위클래스인 FileReader를 생성하여 대입
		
		Reader reader = new FileReader("D:\\test.txt");
		char[] cbuf = new char[4];
		
		int readData =  reader.read(cbuf,1,2);
		
		System.out.println("읽은 문자 수 : "+readData);
		
		//출력결과는 0 인덱스는 그냥 공백이 나오며 2,3 인덱스에 잇는것만 읽는것을 알수가있다.
		for(int i=0; i<cbuf.length; i++) 
			System.out.println(i+"번째 문자 : "+cbuf[i]);
		
		
		reader.close();

	}

}
