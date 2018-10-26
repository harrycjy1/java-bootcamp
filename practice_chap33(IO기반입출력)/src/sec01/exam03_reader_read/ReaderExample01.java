package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample01 {

	public static void main(String[] args) throws Exception{
		// Reader의 하위 클래스인 FileReader를 생성하여 대입하고 있다
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		//readData는 int값으로 끝 2바이트(문자는 2바이트)에 저장된다.
		while((readData=reader.read())!=-1) {
			//문자출력(바이트정보를 강제 캐스팅)
			System.out.println("읽은 문자 : "+(char)readData);
			System.out.println("읽은 문자 : "+readData); //유니코드출력
		}
		
		//아래와 같이 작성해도 됨
		/*while(true) {
			readData = reader.read();
			if(readData==-1)
				break;
			
			System.out.println("읽은 문자 : "+(char)readData);
			System.out.println("읽은 문자 : "+readData); //유니코드출력
		}*/
		reader.close(); //자원 해제
	}

}
