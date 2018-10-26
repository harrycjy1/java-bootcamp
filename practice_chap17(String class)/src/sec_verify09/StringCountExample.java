package sec_verify09;

public class StringCountExample {

	static int 	count (String src, String target) {
		int count =0;
		int i =0;
		
		while(true) {
			src.indexOf(target);
		if(src.indexOf(target)!=-1) {
			src=src.substring(i+target.length());
			count++;	
			}
		else {
			break;
		}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String s = "대구를 사랑합시다.대구!";
		System.out.println(s);
		System.out.println("위 문자열에는 대구라는 단어가 총"+count(s, "대구")+"번 있어요");
		
		System.out.println();
		String s2 = "I like LG, I like Pizza!";
		System.out.println(s2);
		System.out.println("위 문자열에는 대구라는 단어가 총"+count(s2, "대구")+"번 있어요");
		
	}

}
