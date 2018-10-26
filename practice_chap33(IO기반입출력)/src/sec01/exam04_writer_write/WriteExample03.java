package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample03 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("D:\\text.txt");
		char[] data = "신은혁".toCharArray();
		
		//write()의 매개변수 타입이 문자배열이다. 호출하고 예외가 발생치 않았다면 정상실행
		//이전 코드보다 문자배열자체를 매개값으로 보내기 때문에 훨씬 효율적
		writer.write(data,1,2);
	
		writer.flush();
		writer.close();
	}

}
