package sec01_exam;

public class StringEqualsEx {

	public static void main(String[] args) {
	
		
		
	String strVar1="�Ź�ö";
	String strVar2="�Ź�ö";//new�� ���� literal����
	String strVar3=new String("�Ź�ö");
	
	System.out.println("--------------");
	

	System.out.println(strVar1==strVar2); //(�ڹٿ��� String�� ���ͷ��� �������, ���� ���� ����)
	System.out.println(strVar1==strVar3); //�ּҰ� ��(strVar3�� ���� ��ü�� ���������Ƿ� �ּҰ� �ٸ�)
	System.out.println();
	
	System.out.println(strVar1.equals(strVar2));
	System.out.println(strVar1.equals(strVar3));
	//���� ������ ��(�Ź�ö�̶�� ����)
	//equals�� �� ���� ���� �������� ����(String����)
	//(Object�� equals�� ��ü�� �ּҰ� ����(String�̶� �ٸ�))
	}

}
