package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();// Car �ν��Ͻ� ����
		
		/*c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;*/
		
		//���� �ֹ��Ҷ� �ѹ��� �������ִ� ����
		
		Car c2 = new Car("�Ķ�","����",8);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
