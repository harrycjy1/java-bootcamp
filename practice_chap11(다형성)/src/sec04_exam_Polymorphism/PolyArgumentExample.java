package sec04_exam_Polymorphism;

public class PolyArgumentExample {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� "+b.money+"���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������"+b.bonuspoint+"�� �Դϴ�.");
	}

}
