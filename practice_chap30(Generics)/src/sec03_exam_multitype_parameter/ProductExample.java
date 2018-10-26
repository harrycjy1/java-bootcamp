package sec03_exam_multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Tv, String> pro1 = new Product<>();
		
		pro1.setT(new Tv(2016,06));
		pro1.setM("LG OLED 스마트TV");
		
		Tv tv = pro1.getT();
		String str1 = pro1.getM();
		System.out.println("내 티비는 "+tv.getYear() +"년 "+tv.getMonth()+"월 출시된 "+str1 +"이다.");
		System.out.println();
		
		Product<Car,String> pro2 = new Product<>();
		pro2.setT(new Car("삼성",2010,05));
		pro2.setM("뉴 SM5 신형");
		
		Car car = pro2.getT();
		String str2 = pro2.getM();
		
		System.out.println("내 차는"+car.getYear()+"년 "+car.getMonth()+"월 출시된 "+car.getBrand()+"의 "+str2+"이다.");
		

	}

}
