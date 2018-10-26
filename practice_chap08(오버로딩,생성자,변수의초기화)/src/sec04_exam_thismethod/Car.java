package sec04_exam_thismethod;

public class Car {

	String color;
	String gearType;
	int door;
	
	//생성자
	//아무런 생성자가 없으면 컴파일러가 기본생성자 만듬
	
	public Car() {
		this("white","auto",4);
	}

	public Car(String color) {
		this(color,"auto",4);
	}
	public Car(String color, String gearType) {
		this(color,gearType,4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door = door;
		
	}
	
	//어노테이션(annotation) : 컴파일러에게 강하게 체크 하라는 뜻.
	//(내가 재정의를 했으니 맞는지 한번 확인)
	
	@Override
	public String toString() {
		String str = "color = "+this.color+", gearType = "+this.gearType+", door = "+this.door;
		return str;
	}












}
