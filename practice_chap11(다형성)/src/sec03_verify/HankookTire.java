package sec03_verify;

public class HankookTire extends Tire{

	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
		
	}
	
	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HakookTire ���� : "+(maxRotation-accumulatedRotation+"ȸ"));
			return true;
		}
		else {
			System.out.println("*** "+location+"Tire��ũ ***");
			return false;
		}
	}
}
