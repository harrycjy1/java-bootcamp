package sec04_verify;

import java.util.Vector;

import sec03_verify.HankookTire;

public class Car {

	
	Vector tires = new Vector();
	Tire flt = new Tire("앞왼쪽",6);
	Tire frt = new Tire("앞오른쪽",2);
	Tire blt = new Tire("뒤왼쪽",3);
	Tire brt = new Tire("뒤오른쪽",4);
	
	
	
	public int run() {
		
		this.tires.add(flt);
		this.tires.add(frt);
		this.tires.add(blt);
		this.tires.add(brt);
		
		
		System.out.println("[자동차가 달립니다.]");
		
		if(flt.roll()==false) {
			stop();
			this.tires.remove(0);
			this.tires.add(new KumhoTire("앞왼쪽",20));
			System.out.println("앞왼쪽 KumhoTire로 교체");
			System.out.println("----------------------------------------");
			return 1;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(1);
			this.tires.add(new KumhoTire("앞오른쪽",13));
			System.out.println("앞오른쪽 KumhoTire로 교체");
			System.out.println("----------------------------------------");
			return 2;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(2);
			this.tires.add(new KumhoTire("뒤왼쪽",14));
			System.out.println("뒤왼쪽 HankookTire로 교체");
			System.out.println("----------------------------------------");
			return 3;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(3);
			this.tires.add(new KumhoTire("뒤오른쪽",14));
			System.out.println("뒤오른쪽 HankookTire로 교체");
			System.out.println("----------------------------------------");
			return 4;
		}
		return 5;
	}
	


	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}






}
