package sec02_exam;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);//1
		
		//ex?�������� ��ó�? ��� ����� ��
		
		change(d.x);
		
		System.out.println("After change(d.x)");//3
		System.out.println("main() : x = "+d.x);//4
		
	}
	
	//�⺻�� �Ű�����
	static void change(int x) {
		x=1000;
		System.out.println("change() : x ="+x);//2
	}
	
	
	
}
