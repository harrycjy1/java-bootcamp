package sec03_verify;

public class SportsCarExample {

	public static void main(String[] args) {
		
		SportsCar car=new SportsCar();
		
		System.out.println("���� ������ī�� �ӵ��� "+car.speed+"�Դϴ�.");
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.stop();
	}

}
