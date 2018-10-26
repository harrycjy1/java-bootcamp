package sec06_exam_anonymous_implements;

public class Anonymous {
		//필드의 초기값으로 사용된 경우
	RemoteControl field = new RemoteControl() {
		//익명 구현클래스
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	void method1() {
		//로컬변수로 인터페이스타입을 선언후 익명구현객체 생성
		
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
				
			}
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
				
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//매개변수로 인터페이스 타입이 들어왔다. 이 의미는?
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
}
