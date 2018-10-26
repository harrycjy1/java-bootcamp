package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {
	public static void main(String[] args) throws Exception {

	//파일로부터 출력스트림을 생성하여 대입한다.
	OutputStream os = new FileOutputStream("D:\\test.txt");
	
	byte[] data = "ABC".getBytes();

	System.out.println(Arrays.toString(data));
	
	for(int i=0; i<data.length; i++) {
		os.write(data[i]);
	}
	
	//write()를 사용하면 무조건 flush()를 호출하여 메모리버퍼를 비우도록 하자
	//물론 main을 종료하면 알아서 비우지만 웬만하면 flush를 쓰자
	
	os.flush();
	os.close();
	
	}
}
