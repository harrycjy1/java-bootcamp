package sec04_exam_generic_method_1;

public class Util {
		
	//<T>�� ���׸�Ÿ�� �޼��带 �ǹ��ϸ�, ����Ÿ�԰� �Ű����� ���׸� Ÿ����
	//<T>�� �ϰڴٴ� �ǹ� �ܺηκ��� TŸ���� �޾Ƽ� BOX��ü�� �����Ͽ�
	//�� ��ü�� �����ϴ� �޼���
	
	//staticŰ���带 ��� �� �� ���ٴ� ���ʸ� ��Ű�� ����
	//�޼��带 ���� ���� Ŭ���� ����
	public static<T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
}
