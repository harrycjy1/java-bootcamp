package sec06_verify;

public class DmbCellPhone extends CellPhone{

	int  channel;	
	
	public DmbCellPhone(String model, String color, int channel) {
	
		System.out.println("�� : "+model);
		System.out.println("���� : "+color);
		System.out.println("ä�� : "+channel);
		System.out.println();
	}
	
	void turnonDmb() {
		System.out.println("ä�� "+this.channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void turnoffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	void changechannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä�� "+this.channel+"������ �ٲߴϴ�.");
	}
	
	
	
}
