package sec05_verify;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		
		MemberServiceClass mem = new MemberServiceClass();
		
		mem.login("hong", "12345");
		mem.logout("hong");
		
		mem.logout("cho");
		
		
		
		
		
		
		
	}

}
