package sec02_exam_Instanceof;

class car {

}

class FireEngine extends car{}

public class InstanceofExample1{
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		
		//instanceof �������� ����� ���̸� ����ȯ�� �����ϴٶ�� �Ϳ� �ָ�!
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		//��������.getClass()�� ���������� �ν��Ͻ��� ��������� �޼����̸�,
		//getName()�� �ش�Ŭ������ ��Ű���� Ŭ�������� ����ϴ� ���̴�
		//����, getSimpleName()�� ��Ű������ �����ϰ� �ܼ� Ŭ������ ����ϴ� �޼���
		
		System.out.println(fe.getClass().getName());
		System.out.println(fe.getClass().getSimpleName());
		
		
		
		
		
		
	}
}