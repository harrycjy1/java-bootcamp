package sec02_exam_Nested_Outter_Refer;

public class Outter {
	//외부 클래스 멤버변수
	String field = "Outter_field";
	
	public void method() {
		System.out.println("바깥클래스 메서드 호출");
	}
	
	
	class Nested{
		//내부클래스 멤버 변수
		String field = "Inner_field";
		public void method() {
			System.out.println("내부 클래스 메서드 호출");
		}
		//내부클래스 메서드
		public void print() {
			System.out.println(this.field);
			this.method();
			//바깥클래스 접근 방법을 나타냄
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
	
	
	
}
