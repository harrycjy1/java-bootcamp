package sec06_verify;

public class SamsungExample {

	public static void main(String[] args) {
		
		SamsungCar sam = new SamsungCar();
		
		sam.setCompany("apple");
		sam.setColor("white");
		sam.setModel("SM2");
		sam.setMaxSpeed(-5);
		
		
		sam.setMaxSpeed(240);
		sam.setCompany("samsung");
		sam.setModel("SM5");
		
		System.out.println(sam);

	}

}

