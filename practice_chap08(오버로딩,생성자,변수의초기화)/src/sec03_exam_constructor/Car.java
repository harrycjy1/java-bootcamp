package sec03_exam_constructor;

public class Car {

	String color;
	String gearType;
	int door;
	
	//생성자
	//아무런 생성자가 없으면 컴파일러가 기본생성자 만듬
	
	public Car() {
		this("white","auto",4);
		System.out.println("기본 생성자 호출");
	}

	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door = door;
		System.out.println("매개변수가 있는 생성자 호출");
	}
	
	//어노테이션(annotation) : 컴파일러에게 강하게 체클ㄹ 하라는 뜻.
	//(내가 재정의를 했으니 맞는지 한번 확인)
	
	@Override
	public String toString() {
		String str = "색깔 = "+this.color+", 기어타입 = "+this.gearType+", 문 갯수 = "+this.door;
		return str;
	}












}
