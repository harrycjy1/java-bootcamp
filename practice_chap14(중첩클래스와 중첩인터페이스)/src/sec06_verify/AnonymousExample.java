package sec06_verify;

public class AnonymousExample {

	public static void main(String[] args) {
		System.out.println("=================================");
		Anonymous a = new Anonymous();
		System.out.println("�����Ű� �޸��ϴ�.");
		
		for(int i=0; i<11; i++) {
			
			a.field.run();
		}
		System.out.println("=================================");
		System.out.println();
		
		
		
		
		System.out.println("=================================");
		System.out.println("�¿����� �޸��ϴ�.");
		for(int i =0; i<7; i++) {
			a.passengerCar();
		}
		System.out.println("=================================");
		System.out.println();
		
		
		
		
		System.out.println("=================================");
		System.out.println("����Ⱑ �̷��մϴ�.");
		
		//for
		
		a.airPlane(new Vehicle() {
			
			int airplanespeed;
			
			@Override
			public void speedup() {
				airplanespeed+=100;
			}
			
			@Override
			public void run() {
				System.out.println("������� ���� ���ǵ� : "+airplanespeed+"KM �Դϴ�.");
				
			}
		});

	}

}
