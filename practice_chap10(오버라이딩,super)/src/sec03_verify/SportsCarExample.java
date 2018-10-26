package sec03_verify;

public class SportsCarExample {

	public static void main(String[] args) {
		
		SportsCar car=new SportsCar();
		
		System.out.println("현재 스포츠카의 속도는 "+car.speed+"입니다.");
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
