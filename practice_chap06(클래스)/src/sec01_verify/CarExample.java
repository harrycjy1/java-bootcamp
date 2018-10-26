package sec01_verify;

public class CarExample {

	public static void main(String[] args) {
		
		
		Car ca = new Car();
		
		ca.setCompany("현대자동차");
		ca.setColor("검정");
		ca.setMaxspeed("350");
		ca.setModel("그랜저");
		ca.setSpeed("0");
		ca.setModispeed("60");
		
		System.out.println(ca.toString());

	}

}
