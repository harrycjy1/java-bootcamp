package sec04_verify;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		
		SmartPhone p =new SmartPhone();
		
		p.Sendcall();
		p.receivecall();
		p.SendSMS();
		p.SendSMS();
		p.play();
		p.stop();
		System.out.println("��� :"+p.calculate(3, 5));
		p.scheduler();
		p.applicationManager();

	}

}
