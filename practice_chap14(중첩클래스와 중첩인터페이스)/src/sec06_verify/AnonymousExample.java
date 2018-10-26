package sec06_verify;

public class AnonymousExample {

	public static void main(String[] args) {
		System.out.println("=================================");
		Anonymous a = new Anonymous();
		System.out.println("자전거가 달립니다.");
		
		for(int i=0; i<11; i++) {
			
			a.field.run();
		}
		System.out.println("=================================");
		System.out.println();
		
		
		
		
		System.out.println("=================================");
		System.out.println("승용차가 달립니다.");
		for(int i =0; i<7; i++) {
			a.passengerCar();
		}
		System.out.println("=================================");
		System.out.println();
		
		
		
		
		System.out.println("=================================");
		System.out.println("비행기가 이륙합니다.");
		
		//for
		
		a.airPlane(new Vehicle() {
			
			int airplanespeed;
			
			@Override
			public void speedup() {
				airplanespeed+=100;
			}
			
			@Override
			public void run() {
				System.out.println("비행기의 현재 스피드 : "+airplanespeed+"KM 입니다.");
				
			}
		});

	}

}
