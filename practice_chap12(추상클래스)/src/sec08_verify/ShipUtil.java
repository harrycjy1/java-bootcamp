package sec08_verify;

public class ShipUtil {

	
	
	static void 	search(Ship s) {
		if(s instanceof Boat) {
			System.out.println("Boat 이름 : "+((Boat) s).name()+", 인원 : "+s.move()+", 무기 : "+s.carry());
		}
		if(s instanceof Cruise) {
			System.out.println("Cruise 이름 : "+((Cruise) s).name()+", 인원 : "+s.move()+", 무기 : "+s.carry());
		}
	}
}
