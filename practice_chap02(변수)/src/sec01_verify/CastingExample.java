package sec01_verify;

public class CastingExample {

	public static void main(String[] args) {
		
	
		
		int intValue = 44032;	
		char charValue = (char)intValue;
		System.out.println("intValue���� charValue�� ����ĳ���� ����� : " + charValue);
		
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println("longValue���� intValue�� ����ĳ���� ����� :" + intValue);
		
		
		double doubleValue = 3;
		intValue = (int)doubleValue;
		System.out.println("doubleValue���� intValue�� ����ĳ���� ����� :" + intValue);
		
		
		
		
	}

}
