package sec03_verify;

public class Car {

	int speed=0;
	
	public final void speedUp() {
		this.speed = speed+10;
		System.out.println("현재 스포츠카의 속도는 "+this.speed+"KM 입니다.");//메서드앞 final 붙으면 상속이 안됨.
	}
	public void speedDown() {
		this.speed = speed-10;
		if(speed<0) {
			System.out.println("현재 스포츠카의 속도를 더 내릴 수 없습니다.");
		}
		else {
			System.out.println("현재 스포츠카의 속도는 "+this.speed+"KM 입니다.");
		}
	}
	public void stop() {
		System.out.println("차를 멈춥니다.");
	}
	
	
}
