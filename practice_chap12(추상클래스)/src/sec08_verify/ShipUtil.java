package sec08_verify;

public class ShipUtil {

	
	
	static void 	search(Ship s) {
		if(s instanceof Boat) {
			System.out.println("Boat �̸� : "+((Boat) s).name()+", �ο� : "+s.move()+", ���� : "+s.carry());
		}
		if(s instanceof Cruise) {
			System.out.println("Cruise �̸� : "+((Cruise) s).name()+", �ο� : "+s.move()+", ���� : "+s.carry());
		}
	}
}
