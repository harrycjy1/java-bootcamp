package sec01_exam;

public class FieldInitValueExample {

	public static void main(String[] args) {
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("�⺻�� ����");
		System.out.println("byteField : "+fiv.byteField);
		System.out.println("shortField : "+fiv.shortField);
		System.out.println("intField : "+fiv.intfield);
		System.out.println("longField : "+fiv.longfield);
		System.out.println("booleanField : "+fiv.booleanField);
		
		//charŸ���� ���� ����.
		System.out.println("charfield : "+fiv.charField);
		System.out.println("floatfield : "+fiv.floatField);
		System.out.println("doublefield : "+fiv.doubleField);
		System.out.println();
		System.out.println("������ ����");
		System.out.println("arrfield : "+fiv.arrField);
		System.out.println("referencefield : "+fiv.referenceField);
		
		/*�ν��Ͻ� ������ ����ϸ� �ν��Ͻ��� �ּҰ� ����� ��.
		object�� ��ӹޱ� ������ ��¹��� ���������� ������ �� objectŬ������ 
		toString()�ڵ� ȣ���. ������ ������ �������̵�(������)�� toString()�� ȣ��*/
		
		System.out.println("class referenceValiable : " + fiv);
	}

}
