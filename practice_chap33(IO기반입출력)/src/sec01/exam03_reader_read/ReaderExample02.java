package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample02 {

	public static void main(String[] args) throws Exception{
		//Reader의 하위 클래스인 FileReader를 생성하여 대입
		Reader reader = new FileReader("D:\\text.txt");
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		//아래와 같이 StringBuilder클래스를 사용해도 된다
		//StringBuilder sb = new StringBuilder();
		
		//read()의 매개\타입이 char배열
		while((readData=reader.read(cbuf))!=-1) {
			//sb.append(cbuf)
			data+= new String(cbuf,0,readData);
			System.out.println("읽은 문자 수 : "+readData); //유니코드 출력
		}
		System.out.println(data);
		//System.out.println(sb);
		reader.close();
	}

}
