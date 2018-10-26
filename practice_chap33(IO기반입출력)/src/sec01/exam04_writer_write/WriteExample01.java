package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("D:\\text.txt");
		char[] data = "홍길동".toCharArray();
		
		for(int i=0; i<data.length; i++) {
			//write()를 호출하고 예외가 발생치 않았다면 정상적으로 실해잉 된것이다.
			writer.write(data[i]);
			System.out.println("루핑수 : "+i);
		}
		writer.flush();
		writer.close();
	}

}
