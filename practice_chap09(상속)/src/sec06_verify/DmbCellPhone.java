package sec06_verify;

public class DmbCellPhone extends CellPhone{

	int  channel;	
	
	public DmbCellPhone(String model, String color, int channel) {
	
		System.out.println("모델 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("채널 : "+channel);
		System.out.println();
	}
	
	void turnonDmb() {
		System.out.println("채널 "+this.channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void turnoffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void changechannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}
	
	
	
}
