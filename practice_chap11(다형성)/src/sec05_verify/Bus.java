package sec05_verify;

public class Bus extends Vehicle{

	
	//오버라이딩
	public void run() {
		System.out.println("조상클래스 타입에 적용되는 자손클래스들의 run메서드를 호출합니다");
	}
	
	@Override
	public String toString() {
		
		return "버스";
	}
}
