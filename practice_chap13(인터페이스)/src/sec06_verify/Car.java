package sec06_verify;

public class Car {

	Tire 			flt;
	Tire 			frt;
	Tire 			blt;
	Tire 			brt;
	
	public void run() {
		flt = new HankookTire();
		frt = new HankookTire();
		blt = new HankookTire();
		brt = new HankookTire();
		
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
		
		flt = new KumhoTire();
		frt = new KumhoTire();
		blt = new KumhoTire();
		brt = new KumhoTire();
		
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
		
	}
}
