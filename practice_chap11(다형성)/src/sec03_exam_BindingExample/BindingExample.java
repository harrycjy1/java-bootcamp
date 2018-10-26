package sec03_exam_BindingExample;

public class BindingExample {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = new Child();
		
		/*
		멤버변수는 각 인스턴스에 있는 값을 출력함.
		멤버메서드의 경우 오버라이딩된 자손클래스의 메서드를 둘다 호출함에 주의하자
		물론, 자손클래스에서 아무것도 정의도지 않았다면, 조상클래스의 멤버 변수와 멤버 메서드가 호출
		*/
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}

}
