package sec02_exam_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
			
		String str = "안녕하세요";
		
		//인코딩(컴퓨터가 알아보기 싶게 변환하는 과정)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : "+ bytes1.length); //10바이트가 나온다. 이유는?
		
		//디코딩(사람이 알아보기 싶게 변환하는 과정)
		String str1 = new String(bytes1);
		System.out.println("바이트 -> 문자열 : "+str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : "+ bytes2.length); //10바이트 이유는?
			
			String str2 = new String(bytes2,"UTF-8"); //EUC-KR은 한글을 2바이트 취급한다.
			System.out.println("바이트 -> 문자열 : "+str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : "+ bytes3.length); //15바이트 이유는?
			
			String str3 = new String(bytes3,"UTF-8"); //UTF-8 문자셋은 한글한자를 3byte로 취급
			System.out.println("바이트 -> 문자열 : "+str3);
			
			
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
