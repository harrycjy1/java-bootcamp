package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {
		
		
			Bowl<String,String> b1= new Bowl<>();
			b1.setKey("�ڱ���");
			b1.setValue("�����");
			Bowl<String,Integer> b2= new Bowl<>();
			b2.setKey("�ڱ���");
			b2.setValue(65);
			
			System.out.println("Ÿ���Ķ���Ϳ� <String, String>���� ��ü ���� �� ���尪 �ҷ�����");
			System.out.println("�̸� : "+b1.getKey());
			System.out.println("���� : "+b1.getValue());
			System.out.println("Ÿ���Ķ���Ϳ� <String, Integer>���� ��ü ���� �� ���尪 �ҷ�����");
			System.out.println("�̸� : "+b2.getKey());
			System.out.println("���� : "+b2.getValue());
	}

}
