package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {
	Car car = new Car();
	//Car car=null;
	
	//조상타입의 참조변수를 가지고 자손타입의 인스턴스를 다룰 수 잇다.
	//(리모컨의 기능이 多->小 로는 가능), 반대 불가능
	//Car car = new FireEngine(); //이런식으로 가능함
	
	//Car2는 null초기화
	Car car2 =null;
	FireEngine fe = new FireEngine(); //fe도 null초기화
	//Car에 drive()메서드 호출
	
	car.drive();
	//자손타입의 인스턴스를 가지고 조상타입의 인스턴스 다룰수 없음.
	car=fe; //업캐스팅
	fe=(FireEngine) car; //캐스팅오류가 왜 나는것인가???(결과적으로 down캐스팅은 up캐스팅된것을 돌릴때 사용하는것)
	fe.drive();
	car2 = fe;
	car2.drive();
	fe.water();
	
	
	
	}
}