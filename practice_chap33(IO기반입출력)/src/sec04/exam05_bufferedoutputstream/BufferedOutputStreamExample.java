package sec04.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import sec02.exam01_system_in_out.SystemOutExample;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis =null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		int data = 0;
		long start = 0;
		long end = 0;
		
		String path = "D:\\java 작업 조진영\\practice_chap33(IO기반입출력)\\src\\sec04\\exam05_bufferedoutputstream\\젝스키스(세단어).mp3";
		
		//주입력 스트림을 FileinputStrmeam으로 설정후 BufferedInputStream보조스트림을 연결
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("D:/example/노래복사본.mp3");
		//bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		
		while((data = bis.read())!=-1) {
			fos.write(data);
		}
		
		fos.flush();
		end= System.currentTimeMillis();
		
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("버퍼아웃스트림 사용 하지 않았을때 : "+(end-start)+"ms");
		System.out.println();
		//
		
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("D:/example/노래복사본2.mp3");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		
		while((data = bis.read())!=-1) {
			bos.write(data);
		}
		
		bos.flush();
		end= System.currentTimeMillis();
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("버퍼아웃스트림 사용 했을때 : "+(end-start)+"ms");
		
		
	}

}
