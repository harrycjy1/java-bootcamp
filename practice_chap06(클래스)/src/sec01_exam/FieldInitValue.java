package sec01_exam;

public class FieldInitValue {

	
	
		//���������� �ϰ�. �ʵ��� ��
		byte byteField;			//1
		short shortField;		//2
		int intfield;			//3
		long longfield;			//8
		
		boolean booleanField;	//1
		char charField;			//2(�����ڵ�)1(�ƽ�Ű�ڵ�)
		
		float floatField;		//4
		double doubleField;		//8
		
		int[] arrField;			//4
		String referenceField;	//4
		
		//toString()�� ������ �������(�ʵ�)�ǰ����� ���÷� Ȯ���ϰ��� �Ҷ�
		//Ȥ�� �ڽ��� ���Ĵ�� ����� ���Ҷ� toString()�������̵��� �Ѵ�.
		
		@Override//Annotation(�����Ϸ����� ����)
		public String toString() {
		return "String";
		}
		
		
}
