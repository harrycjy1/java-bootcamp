package sec03_exam_constructor;

public class Car {

	String color;
	String gearType;
	int door;
	
	//������
	//�ƹ��� �����ڰ� ������ �����Ϸ��� �⺻������ ����
	
	public Car() {
		this("white","auto",4);
		System.out.println("�⺻ ������ ȣ��");
	}

	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door = door;
		System.out.println("�Ű������� �ִ� ������ ȣ��");
	}
	
	//������̼�(annotation) : �����Ϸ����� ���ϰ� üŬ�� �϶�� ��.
	//(���� �����Ǹ� ������ �´��� �ѹ� Ȯ��)
	
	@Override
	public String toString() {
		String str = "���� = "+this.color+", ���Ÿ�� = "+this.gearType+", �� ���� = "+this.door;
		return str;
	}












}
