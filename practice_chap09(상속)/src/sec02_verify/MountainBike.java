package sec02_verify;

public class MountainBike extends Bicycle {

	
	String 		frame;
	int 		gear;
	String 		money;
	
	
	
	void prtInfo() {
		if(brand=="Scott") {
			this.gear = 30;
			this.money = "8õ����";
			this.frame = "ī��";
		}
		else if(brand=="Giant") {
			this.gear = 27;
			this.frame = "�˷�̴�";
			this.money = "30����";
		}
		else if(brand=="Lespo") {
			this.gear = 18;
			this.frame = "ö";
			this.money = "5����";
		}
		else {
			System.out.println("�߸��� �귣���̸��Դϴ�.");
		}
		
		System.out.println("���� : "+this.gear+"�� �Դϴ�.");
		System.out.println("�������� : "+ this.frame+"�Դϴ�.");
		System.out.println("������ : "+this.money+"�Դϴ�.");
		System.out.println();
	}
	
	
	
	public MountainBike(int id, String brand) {
		super(id,brand);
		System.out.println("�� �����Ŵ� ��ǥ��"+this.brand+"�Դϴ�.");
		
	}
	
	
}
