package sec03_verify;

public class Car {

	String 		company  =	"현대자동차";
	String 		model;
	String 		color;
	int 		maxSpeed;
	
	Car(){}
	
	Car(String model){
		this.model=model;
	}
	
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	//Car 생성자 오버로딩
	//각각 매개변수의 갯수가 다르므로 오버로딩 조건을 충족한다.
	
}
