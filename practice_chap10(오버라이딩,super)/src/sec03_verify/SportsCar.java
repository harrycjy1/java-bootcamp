package sec03_verify;

public class SportsCar extends Car{

	public int getSpeed() {
		return speed;
	}
	
	@Override
	public void stop() {
		super.stop();
		System.out.println("������ī�� ����ϴ�.");
		System.out.println("���� ������ī�� �ӵ��� 0�Դϴ�");
	}
}
