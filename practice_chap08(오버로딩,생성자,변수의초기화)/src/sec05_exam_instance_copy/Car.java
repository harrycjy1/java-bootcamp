package sec05_exam_instance_copy;

public class Car {

	String color;
	String gearType;
	int door;
	
	//������
	//�ƹ��� �����ڰ� ������ �����Ϸ��� �⺻������ ����
	
	public Car() {
		this("white","auto",4);
	}
	
	public Car(Car c) {
		this.color = c.color;
		this.gearType=c.gearType;
		this.door = c.door;
	} //�ν��Ͻ��� ���縦 ���� ������. ==��ü �ʱ�ȭ(object initialization)
	
	public Car(String color) {
		this(color,"auto",4);
	}
	public Car(String color, String gearType) {
		this(color,gearType,4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door = door;
		
	}
	
	//������̼�(annotation) : �����Ϸ����� ���ϰ� üũ �϶�� ��.
	//(���� �����Ǹ� ������ �´��� �ѹ� Ȯ��)
	
	@Override
	public String toString() {
		String str = "color = "+this.color+", gearType = "+this.gearType+", door = "+this.door;
		return str;
	}












}
