package sec08_verify;

public class ShipExample {

	public static void main(String[] args) {
		//Boat boat = new Boat();
		//Cruise cruise = new Cruise();
		ShipUtil ship = new ShipUtil();
		Ship boat = new Boat();
		Ship cruise = new Cruise();
		System.out.println("Boat�� ���� �� �ִ� �ο� : "+boat.move());
		System.out.println("Boat�� ���� �� �ִ� ���� : "+boat.carry());
		System.out.println("Cruise�� ���� �� �ִ� �ο� : "+cruise.move());
		System.out.println("Cruise�� ���� �� �ִ� ���� : "+cruise.carry());
		ship.search(boat);
		ship.search(cruise);

	}

}
