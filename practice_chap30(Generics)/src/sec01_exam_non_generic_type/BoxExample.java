package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//�Ʒ� �ڵ带 �����ϴ� ���� �ʹ��� �߿��ϴ�
		Box box = new Box();
		
		box.set("ȫ�浿");
		String name = (String)box.get();
		System.out.println(name);
		
		//���� ���� ���������̴�
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}
}
