package sec01_exam_CastingEx;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //up casting
		//car.water(); 조상 참조변수로 자손의 멤버 메서드를 참조할순 없다. (drive,stop메서드는 사용가능)
		fe2 = (FireEngine)car;
		fe2.water();

	}

}
