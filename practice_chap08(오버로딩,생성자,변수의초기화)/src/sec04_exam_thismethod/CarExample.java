package sec04_exam_thismethod;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();				//�⺻���������� this()�� white,auto,4�� �ʱ�ȭ �ص� ���� ����
		Car c2 = new Car("blue");
		Car c3 = new Car("green","����");
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
