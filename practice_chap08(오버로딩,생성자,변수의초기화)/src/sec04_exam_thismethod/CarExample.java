package sec04_exam_thismethod;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();				//기본생성자지만 this()로 white,auto,4로 초기화 해둔 값이 나옴
		Car c2 = new Car("blue");
		Car c3 = new Car("green","수동");
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
