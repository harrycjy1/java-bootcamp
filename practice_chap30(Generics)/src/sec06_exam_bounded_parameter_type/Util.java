package sec06_exam_bounded_parameter_type;

public class Util {

			//매개변수의 T타입을 <T extends Number> 로 선언한것은,
			//Number클래스 이거나 서브클래스만 적용되도록 제한을 함.
	public static <T extends Number> int compare(T t1, T t2) {
		//Number클래스의 doubleValue()란 추상메서드를 이용함
		//결과론적으로 Number클래스를 상속받는 클래스중,
		//doubleValue()추상메서드를 재정의한 클래스만 가능하다고 보면 된다.
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		return Double.compare(value1, value2);
		
		
	}
}
