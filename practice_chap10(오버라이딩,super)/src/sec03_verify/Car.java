package sec03_verify;

public class Car {

	int speed=0;
	
	public final void speedUp() {
		this.speed = speed+10;
		System.out.println("���� ������ī�� �ӵ��� "+this.speed+"KM �Դϴ�.");//�޼���� final ������ ����� �ȵ�.
	}
	public void speedDown() {
		this.speed = speed-10;
		if(speed<0) {
			System.out.println("���� ������ī�� �ӵ��� �� ���� �� �����ϴ�.");
		}
		else {
			System.out.println("���� ������ī�� �ӵ��� "+this.speed+"KM �Դϴ�.");
		}
	}
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
	
}
