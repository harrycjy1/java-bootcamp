package sec_verify02;

public class StringBufferDelCharExample {

	
	public static String delChar(String src,String delch) {
		
		StringBuffer sb = new StringBuffer(src.length());
	
		
		for(int i=0; i<src.length(); i++) {
			char ch1 = src.charAt(i);
			if(delch.indexOf(ch1)==-1) {
				sb.append(ch1);
			}
			
			
		}
		
		
		return sb.toString();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("(나는!자바를@사랑^^합니다.)"+" -> " + delChar("(나는! 자바를@ 사랑^^합니다.)","(!@^)"));
		System.out.println("(1 2 3 4\t5)"+" -> " + delChar("(1 2 3 4\t5)"," \t"));
		System.out.println(Character.MIN_VALUE);
	

		/*for(int i=0; i<delch.length(); i++) {
			
			System.out.println("delch.charAt : " + delch.charAt(i));
			src = src.replace(delch.charAt(i),Character.MIN_VALUE);
			System.out.println(src);
		}*/
		
	}

}
