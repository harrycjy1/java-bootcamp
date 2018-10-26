package sec05_verify;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle v1		=new Vehicle();
		Bus bus			=new Bus();			
		Taxi taxi		=new Taxi();
		
		Driver 	d	=new Driver();
		
		v1.run();
		bus.run();
		d.drive(bus);
		taxi.run();
		d.drive(taxi);
	}

}
