package sec02_try_catch_finally;

public class TryCatchFinallyExample01 {

	public static void main(String[] args) {
		//Class클래스는 무자열을 가지고 클래스로 만들어서 반환해준다.
		//(인스턴스를 사용할 수 있지만, 반환된 인스턴스의 정보만 알뿐이다.
		//하지만, 문자열에 해당하는 클래스가 없다면 일반 예외가 발생한다.
		//그래서 컴파일이 되지않는다 . 즉 다시마해 예외처리가 필수적이다.
		
		
		try {
			//Class clazz = Class.forName("java.lang.String");
			Class clazz = Class.forName("java.lang.String");
			System.out.println("클래스를 찾앗습니다.");
			System.out.println(clazz.getName());
			System.out.println(clazz.toString());
			System.out.println(clazz.getSimpleName());
			
		}
		catch(Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
			System.out.println(e.toString());
		}
		finally {
			//finally는 무조건 실행한다.
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
	}

}
