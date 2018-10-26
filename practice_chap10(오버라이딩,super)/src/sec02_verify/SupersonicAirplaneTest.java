package sec02_verify;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {
		
		SupersonicAirplane air = new SupersonicAirplane();
		
		air.land();
		air.fly();
		air.flyMode=2;
		air.fly();
		air.flyMode=1;
		air.fly();
		air.takeOff();

	}

}
