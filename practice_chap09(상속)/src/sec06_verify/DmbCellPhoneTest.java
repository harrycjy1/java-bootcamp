package sec06_verify;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice();
		dmb.receiveVoice();
		dmb.sendVoice();
		dmb.hangUp();
		dmb.turnonDmb();
		dmb.changechannelDmb(12);
		dmb.turnoffDmb();
		
	}

}
