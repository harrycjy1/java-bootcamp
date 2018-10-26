package sec03_verify;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Car {

	Tire 	frontLeftTire = new Tire("앞왼쪽",6);
	Tire 	frontRightTire = new Tire("앞오른쪽",2);
	Tire 	backLeftTire  = new Tire("뒤왼쪽",3);
	Tire 	backRightTire = new Tire("뒤오른쪽",4);
	
	
	public void run() {
		
		System.out.println("[자동차가 달립니다.]");

		if(frontLeftTire.roll()==false) {
			stop();
			frontLeftTire = new HankookTire("앞왼쪽", 20);
			System.out.println("앞왼쪽 KumhoTire로 교체");
			System.out.println("----------------------------------------");
			return ;
		}
		if(frontRightTire.roll()==false) {
			stop();
			frontRightTire = new KumhoTire("앞오른쪽", 13);
			System.out.println("앞오른쪽 KumhoTire로 교체");
			System.out.println("----------------------------------------");
			return ;
		}
		if(backLeftTire.roll()==false) {
			stop();
			backLeftTire = new HankookTire("뒤왼쪽",14);
			System.out.println("뒤왼쪽 HankookTire로 교체");
			System.out.println("----------------------------------------");
			return ;
		}
		if(backRightTire.roll()==false) {
			stop();
			backRightTire = new KumhoTire("뒤오른쪽", 20);
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			System.out.println("----------------------------------------");
			return ;
		}
		System.out.println("----------------------------------------");
		return ;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}












}
