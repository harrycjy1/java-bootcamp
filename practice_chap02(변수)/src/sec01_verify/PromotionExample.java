package sec01_verify;

public class PromotionExample {

	public static void main(String[] args) {
	
		byte byteValue = 10;
		char charValue = '��';
		int intValue ;

		
		intValue = byteValue;
		System.out.println("byteValue���� intValue�� �ڵ�ĳ���� �����           :" + intValue);
		
		intValue = charValue;
		System.out.println("charValue���� intValue�� �ڵ�ĳ���� �����(�����ڵ�) : " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println("intValue����  longValue�� �ڵ�ĳ���� ����� : " + longValue);
		
	    intValue = 200;
	    double doubleValue = intValue;
		System.out.println("intValue����  doubleValue�� �ڵ�ĳ���� �����        :" + doubleValue);
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
