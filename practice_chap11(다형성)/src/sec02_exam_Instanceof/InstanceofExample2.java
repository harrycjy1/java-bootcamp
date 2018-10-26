package sec02_exam_Instanceof;


class Parent{}
class Child extends Parent{}

public class InstanceofExample2 {

	//�ָ��Ұ��� �Ű������� ����Ÿ���̶�� �Ϳ� ��������
	public static void method1(Parent parent) {
		//�ſ� �߿��� �ڵ�
		if(parent instanceof Child) {
			//���� ��Ӱ��迡 �־ instanceof�������� ����� true�̹Ƿ� ���� ĳ������ ����.
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		}
		else {
			System.out.println("method1 - child�� ��ȯ ����");
		}
	}

	public static void method2(Parent parent) {
	if(parent instanceof Child) {
		parent = new Child();
		//Child child = (Child)parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	} 
	else {
		System.out.println("method2 - Child�� ��ȯ ����");
		}
	}
	
	//�����
	public static void main(String[] args) {
		//parentA�� ���� ������ ������ �� �ڵ��̰�, parentB�� ������ ���� x
		
	Parent parentA = new Child();
	InstanceofExample2.method2(parentA);
	InstanceofExample2.method1(new Child());
	
	Parent parentB = new Parent();
	InstanceofExample2.method1(parentB);
	//�������� ����Ǹ鼭 �޼��� ȣ���� �Ǿ� ��ȯ�� �����ϴ�.
	InstanceofExample2.method1(new Child());
	InstanceofExample2.method2(parentB);
	
	
	
	
	
	
	
	
	}






















}
