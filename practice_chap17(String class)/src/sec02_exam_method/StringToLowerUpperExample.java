package sec02_exam_method;

public class StringToLowerUpperExample {

	public static void main(String[] args) {
		
		
		String str1 = "Java Programming";
		String str2 = "JAva Programming";
		
		System.out.println(str1.equalsIgnoreCase(str2)); //��ҹ��� ������� ����.
		
		//�ڹٴ� ��ҹ��ڸ� �����Ѵ�.
		System.out.println(str1.equals(str2));
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); //true���� ����?
		
		
	}

}
