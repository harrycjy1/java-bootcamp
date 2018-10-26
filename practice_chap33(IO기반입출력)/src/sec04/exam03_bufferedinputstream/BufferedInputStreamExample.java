package sec04.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		
		long start =0;
		long end = 0;
		String str = "D:\\java 작업 조진영\\practice_chap33(IO기반입출력)\\src\\sec04\\exam03_bufferedinputstream\\젝스키스(세단어).mp3";
		//바이트기반으로 속도의 차이를 보기위한 프로그램
		FileInputStream fis1 = new FileInputStream(str);
		
		System.out.println("바이트 기반 읽기 시작");
		
		start = System.currentTimeMillis();
		while(fis1.read()!=-1) {}
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		
		System.out.println("버퍼를 사용하지 않았을때 시간 : "+(end-start)+"ms");
		fis1.close();
		
		System.out.println();
		//주입력스트림 FileinputStream에다가 속도향상 보조스트림인 BufferedINputStream을 연결함.
		//BufferedInputStream은 보조스트림이기 때문에 파일을 직접 읽어 올 수는 없다
		
		FileInputStream fis2 = new FileInputStream(str);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		
		while (bis.read()!=-1) {}
		System.out.println("버퍼 기반 읽기 끝");
		end = System.currentTimeMillis();
		
		System.out.println("버퍼를 사용 했을때 시간 : "+(end-start)+"ms");
		bis.close();
		fis2.close();

	}

}
