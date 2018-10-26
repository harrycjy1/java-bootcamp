package sec08_verify;

public class ShipExample {

	public static void main(String[] args) {
		//Boat boat = new Boat();
		//Cruise cruise = new Cruise();
		ShipUtil ship = new ShipUtil();
		Ship boat = new Boat();
		Ship cruise = new Cruise();
		System.out.println("Boat가 나를 수 있는 인원 : "+boat.move());
		System.out.println("Boat가 나를 수 있는 무기 : "+boat.carry());
		System.out.println("Cruise가 나를 수 있는 인원 : "+cruise.move());
		System.out.println("Cruise가 나를 수 있는 무기 : "+cruise.carry());
		ship.search(boat);
		ship.search(cruise);

	}

}
