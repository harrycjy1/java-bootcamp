package sec05_verify;

public class CarExample {

	public static void main(String[] args) {
		
		Sedan s=new Sedan();
		Truck t=new Truck();
		
		s.setColor("���");
		s.setSpeed(300);
		s.seatNum=5;
		
		t.setColor("�Ķ�");
		t.setSpeed(100);
		t.capacity=50;
		
		System.out.println(s.toString());
		System.out.println(t.toString());

	}

}
