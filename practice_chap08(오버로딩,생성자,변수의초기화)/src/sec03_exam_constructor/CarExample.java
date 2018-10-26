package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();// Car 인스턴스 생성
		
		/*c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;*/
		
		//차를 주문할때 한번에 지정해주는 형태
		
		Car c2 = new Car("파랑","오토",8);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
