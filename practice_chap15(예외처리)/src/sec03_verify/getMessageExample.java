package sec03_verify;

public class getMessageExample {

	public static void main(String[] args) {
		
		int a = 100, b = 0;
		
		try {
			int result = a/b;
			
		}
		catch(Exception e) {
			System.out.println("�߻� ������ �޽����� ����մϴ�. ==> "+e.getMessage());
		}
		

	}

}
