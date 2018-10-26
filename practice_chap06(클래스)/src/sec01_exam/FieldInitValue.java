package sec01_exam;

public class FieldInitValue {

	
	
		//멤버변수라고도 하고. 필드라고도 함
		byte byteField;			//1
		short shortField;		//2
		int intfield;			//3
		long longfield;			//8
		
		boolean booleanField;	//1
		char charField;			//2(유니코드)1(아스키코드)
		
		float floatField;		//4
		double doubleField;		//8
		
		int[] arrField;			//4
		String referenceField;	//4
		
		//toString()의 역할은 멤버변수(필드)의값들을 수시로 확인하고자 할때
		//혹은 자신의 형식대로 출력을 원할때 toString()오버라이딩을 한다.
		
		@Override//Annotation(컴파일러에게 지시)
		public String toString() {
		return "String";
		}
		
		
}
