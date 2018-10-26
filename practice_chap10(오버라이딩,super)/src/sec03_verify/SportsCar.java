package sec03_verify;

public class SportsCar extends Car{

	public int getSpeed() {
		return speed;
	}
	
	@Override
	public void stop() {
		super.stop();
		System.out.println("스포츠카를 멈춥니다.");
		System.out.println("현재 스포츠카의 속도는 0입니다");
	}
}
