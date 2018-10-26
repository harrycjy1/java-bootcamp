package sec03.exam03_file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		//파일을 복사하기 위해 경로를 설정
		String originalFileName = "D:\\java 작업 조진영\\practice_chap33(IO기반입출력)\\src\\sec03\\exam03_file_output_stream\\김연아.jpg";
		
		String targetFileName = "D:\\example\\김연아1.jpg";
		
		File file= new File(originalFileName); //????
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		int i=0;
		
		//바이트배열을 크게잡을수록 복사시간이 빨라진다.
		//byte[] readBytes = new byte[10000];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis();
		
		while((readByteNo=fis.read(readBytes))!=-1) {
			fos.write(readBytes); //읽은 바이트 수만큼 출력스트림으로 보낸다
			i++;
		}
		fos.flush();
		
		long endTime = System.currentTimeMillis();
		System.out.println("루핑수 : "+i+"\t복사시간 : "+(endTime-currentTime)+"ms"+"\t복사한 파일의 크기 : "+file.length()/1024+"KByte");
		fos.close();
		fis.close();
		System.out.println(file.getName()+"파일의 복사가 완료되었습니다.");
	}

}
