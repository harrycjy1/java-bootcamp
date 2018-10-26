package sec02_exam_Instanceof;


class Parent{}
class Child extends Parent{}

public class InstanceofExample2 {

	//주목할것은 매개변수가 조상타입이라는 것에 집중하자
	public static void method1(Parent parent) {
		//매우 중요한 코드
		if(parent instanceof Child) {
			//서로 상속관계에 있어서 instanceof연산자의 결과가 true이므로 강제 캐스팅이 가능.
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - child로 변환 실패");
		}
	}

	public static void method2(Parent parent) {
	if(parent instanceof Child) {
		parent = new Child();
		//Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	} 
	else {
		System.out.println("method2 - Child로 변환 실패");
		}
	}
	
	//실행부
	public static void main(String[] args) {
		//parentA는 현재 다형성 적용이 된 코드이고, parentB는 다형성 적용 x
		
	Parent parentA = new Child();
	InstanceofExample2.method2(parentA);
	InstanceofExample2.method1(new Child());
	
	Parent parentB = new Parent();
	InstanceofExample2.method1(parentB);
	//다형성이 적용되면서 메서드 호출이 되어 변환이 가능하다.
	InstanceofExample2.method1(new Child());
	InstanceofExample2.method2(parentB);
	
	
	
	
	
	
	
	
	}






















}
