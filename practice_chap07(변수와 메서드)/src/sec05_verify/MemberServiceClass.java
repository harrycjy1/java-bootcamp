package sec05_verify;

public class MemberServiceClass {

	boolean login(String id,String password) {
		if (id.equals("hong")&&password.equals("12345")) {
			System.out.println("hong�� �α��� �Ǿ����ϴ�.");//id�� password�� �Ѵ� �����ؾ� ����
		}
		else {
			System.out.println("ID�� Ȯ�����ּ���!");
		}
	return true;
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("hong�� �α׾ƿ� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ID�� Ȯ�����ּ���!");
		}
	}
	
	
}
