package sec02_exam_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "781125-1985421";
		//Ư�����ڸ� �ް� ������
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':	
			System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
		}

	}

}
