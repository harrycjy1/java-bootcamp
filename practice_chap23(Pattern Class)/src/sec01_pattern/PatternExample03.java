package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

	public static void main(String[] args) {
		
		//���ڿ��� ������ �ִ� �������� �����Ǿ� �ִ��� ����
		String regExp = "(010)-\\d{3,4}-\\d{4}";
		//String regExp = "(010|02|053)-\\d{3,4}-\\d{4}";
		
		String data = "010-123-4567";
		//String data = "053-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		
		if(result==true)
			System.out.println("��ȭ��ȣ ���Խİ� ��ġ�մϴ�.");
		else
			System.out.println("��ȭ��ȣ ���Խİ� ��ġ���� �ʽ��ϴ�.");
		
		//?�� ���� �Ǵ� 1���� �ǹ�
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//data = "angel@naver.com";
		data = "angel@naver.com";
		//data = "angel@naver.co.kr";
		result = Pattern.matches(regExp, data);
		
		if(result==true) 
			System.out.println("�̸��� ���Խİ� ��ġ�մϴ�.");
		else
			System.out.println("�̸��� ���Խİ� ��ġ���� �ʽ��ϴ�.");
	
	
	
	
	
	
	
	}
}
