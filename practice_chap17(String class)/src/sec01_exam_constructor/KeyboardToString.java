package sec01_exam_constructor;

import java.util.Arrays;

public class KeyboardToString {

		//JVM에게 예외를 던짐
	public static void main(String[] args) {
		
		byte[] bytes = new byte[100]; //기본값 0으로 셋팅
		
		//Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");

		//키보드로 입력받는다.(입력받은 바이트수를 리턴)
		
		int readByteNo;
		
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo-2); //2를빼는 이유 ?(엔터키)
			byte[] b = str.getBytes("UTF-8"); 		//한글이 3바이트
			//byte[] b = str.getBytes("EUC-KR");	//한글이 2바이트
			
			
			System.out.println("String 값 : "+str);
			System.out.println("byte[]값 : "+Arrays.toString(b));
			System.out.println("입력받은 바이트 수 :"+readByteNo);
		}
		catch(Exception e) {e.printStackTrace();}
	
	
	
	
	
	
	
	
	}

}
