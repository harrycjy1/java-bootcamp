package sec_verify02;

public class StringMethodExample {

	public static void main(String[] args) {
	
		String a =new String("    java,");
		String b =new String("program,fighting      ");
		
		String ab=a+b;
		String ab2 = ab.trim();
		String ab3 = ab2.replace("a", "1");
		String ab4 = ab3.substring(0, 4);
		String ab5 = ab3.substring(5,12);
		String ab6 = ab3.substring(13);
		char c = ab3.substring(3).charAt(2);
		
		System.out.println("문자열 a와 문자열 b를 연결한 결과 :"+ab);
		System.out.println("문자열 a의 공백을 제거한 결과 : "+ab2);
		System.out.println("문자열 a의 a를 1로 대치한 결과 :"+ab3);
		System.out.println("분리된 0번 문자열 : "+ab4);
		System.out.println("분리된 1번 문자열 : "+ab5);
		System.out.println("분리된 2번 문자열 : "+ab6);
		System.out.println("문자열 a의 substring한 결과  : "+ab3.substring(3));
		System.out.println("문자열 a의 2번째 문자를 char c에 대입한 결과 : "+c);
	}

}
