package sec02_exam_generic_type.copy;

public class BoxExample {

	public static void main(String[] args) {
		//Box<T>���� T�� String�̴�. �� BoxŬ������ ���׸�Ÿ������ ������
		//String Ŭ������ ���ٴٴ°��� �����Ϸ����� ��������� �˸��� ���̴�.
		//Ÿ�Ժ�ȯ ����, �������� ����ȭ(�������� ���)
		
		Box<String> box1= new Box<String>();
		box1.set("ȫ�浿");
		String name = box1.get();
		System.out.println(name);
		
		Box<Integer> box2= new Box<Integer>();
		box2.set(100); //�ڵ��ڽ�
		Integer value = box2.get();
		System.out.println(value);
		
		Box<Apple> box3= new Box<Apple>();
		box3.set(new Apple());
		Apple apple = box3.get();
		System.out.println(apple);
		
	}
}
