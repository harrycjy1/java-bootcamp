package sec07_verify;

public class DriverExample {

	public static void main(String[] args) {
		
		
		Driver d = new Driver();
		
		d.drive(new Bus());
		d.stop(new Bus());
		d.drive(new Taxi());
		d.drive(new Taxi());

	}

}
