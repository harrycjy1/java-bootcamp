package sec04_verify;

import java.util.Vector;

import sec03_verify.HankookTire;

public class Car {

	
	Vector tires = new Vector();
	Tire flt = new Tire("�տ���",6);
	Tire frt = new Tire("�տ�����",2);
	Tire blt = new Tire("�ڿ���",3);
	Tire brt = new Tire("�ڿ�����",4);
	
	
	
	public int run() {
		
		this.tires.add(flt);
		this.tires.add(frt);
		this.tires.add(blt);
		this.tires.add(brt);
		
		
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		if(flt.roll()==false) {
			stop();
			this.tires.remove(0);
			this.tires.add(new KumhoTire("�տ���",20));
			System.out.println("�տ��� KumhoTire�� ��ü");
			System.out.println("----------------------------------------");
			return 1;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(1);
			this.tires.add(new KumhoTire("�տ�����",13));
			System.out.println("�տ����� KumhoTire�� ��ü");
			System.out.println("----------------------------------------");
			return 2;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(2);
			this.tires.add(new KumhoTire("�ڿ���",14));
			System.out.println("�ڿ��� HankookTire�� ��ü");
			System.out.println("----------------------------------------");
			return 3;
		}
		if(frt.roll()==false) {
			stop();
			this.tires.remove(3);
			this.tires.add(new KumhoTire("�ڿ�����",14));
			System.out.println("�ڿ����� HankookTire�� ��ü");
			System.out.println("----------------------------------------");
			return 4;
		}
		return 5;
	}
	


	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}






}
