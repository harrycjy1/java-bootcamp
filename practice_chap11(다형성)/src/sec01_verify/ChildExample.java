package sec01_verify;

public class ChildExample {

	public static void main(String[] args) {


		Parent p = new Child();
		Child c = new Child();
		
		p.method1();
		p.method2();//자손클래스의 오버라이딩한 메서드가 실행
		c.method3();//자손클래스멤버라 근본차이로 인해 p로는 호출 불가

	}

}
