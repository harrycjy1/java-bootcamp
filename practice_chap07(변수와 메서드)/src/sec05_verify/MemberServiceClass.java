package sec05_verify;

public class MemberServiceClass {

	boolean login(String id,String password) {
		if (id.equals("hong")&&password.equals("12345")) {
			System.out.println("hong이 로그인 되었습니다.");//id와 password가 둘다 동일해야 실행
		}
		else {
			System.out.println("ID를 확인해주세요!");
		}
	return true;
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("hong이 로그아웃 되었습니다.");
		}
		else {
			System.out.println("ID를 확인해주세요!");
		}
	}
	
	
}
