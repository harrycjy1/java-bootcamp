package sec03_verify;

public class Tire {

	int 			maxRotation;
	int 			accumulatedRotation=0;
	String 			location;
	
	public Tire(String location, int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}


	public boolean roll() {
		
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ¼ö¸í : "+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}
		else {
			System.out.println("*** "+location+"TireÆãÅ© ***");
			return false;
		}
	}


}







