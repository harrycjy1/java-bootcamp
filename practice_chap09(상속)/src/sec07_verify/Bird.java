package sec07_verify;

public class Bird extends Pet{

	
		String type;
		boolean flightYN;
		
		boolean getflight() {
			if(flightYN==true) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		@Override
		void move() {
			System.out.println("새가 날아가네요");
			System.out.print("새의 종류는 "+this.type+"이고, ");
			if(getflight()==true) {
				System.out.println("날 수 있습니다.");
			}
		}
	
}
