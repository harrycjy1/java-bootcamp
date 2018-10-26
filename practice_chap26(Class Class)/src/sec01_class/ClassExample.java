package sec01_class;

public class ClassExample {

	public static void main(String[] args) {
		
			//��ü�κ��� Ŭ���� ������ ��� ���(ObjectŬ������ getClass()�̿�)
		
		System.out.println("1.������ ��ü�κ��� Ŭ������ ������ ��� ���");
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());	//��Ű�� ���� ������ Ŭ������ ���
		System.out.println(clazz1.getSimpleName());	//Ŭ������ ���	
		System.out.println(clazz1.getPackage().getName());	//��Ű���� ���
		System.out.println();
		
		//���ڿ��κ��� ��ü�� ������ ��� ���
		System.out.println("2. ���ڿ��κ��� ������ Ŭ������ ������ ��� ���");
		
		try{
			Class clazz2 = Class.forName("sec01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());	
		}
		catch(Exception e) {
			System.out.println("�������� �ʴ� Ŭ�����Դϴ�.");
			e.printStackTrace();
		}
	}

}
