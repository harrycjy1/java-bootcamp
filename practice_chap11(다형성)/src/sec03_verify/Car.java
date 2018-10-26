package sec03_verify;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Car {

	Tire 	frontLeftTire = new Tire("�տ���",6);
	Tire 	frontRightTire = new Tire("�տ�����",2);
	Tire 	backLeftTire  = new Tire("�ڿ���",3);
	Tire 	backRightTire = new Tire("�ڿ�����",4);
	
	
	public void run() {
		
		System.out.println("[�ڵ����� �޸��ϴ�.]");

		if(frontLeftTire.roll()==false) {
			stop();
			frontLeftTire = new HankookTire("�տ���", 20);
			System.out.println("�տ��� KumhoTire�� ��ü");
			System.out.println("----------------------------------------");
			return ;
		}
		if(frontRightTire.roll()==false) {
			stop();
			frontRightTire = new KumhoTire("�տ�����", 13);
			System.out.println("�տ����� KumhoTire�� ��ü");
			System.out.println("----------------------------------------");
			return ;
		}
		if(backLeftTire.roll()==false) {
			stop();
			backLeftTire = new HankookTire("�ڿ���",14);
			System.out.println("�ڿ��� HankookTire�� ��ü");
			System.out.println("----------------------------------------");
			return ;
		}
		if(backRightTire.roll()==false) {
			stop();
			backRightTire = new KumhoTire("�ڿ�����", 20);
			System.out.println("�ڿ����� KumhoTire�� ��ü");
			System.out.println("----------------------------------------");
			return ;
		}
		System.out.println("----------------------------------------");
		return ;
	}
	
	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}












}
