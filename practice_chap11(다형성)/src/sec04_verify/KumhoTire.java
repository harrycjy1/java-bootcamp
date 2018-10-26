package sec04_verify;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
		
	}

		public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ¼ö¸í : "+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}
		else {
			System.out.println("*** "+location+"TireÆãÅ© ***");
			return false;
		}
	}
}
