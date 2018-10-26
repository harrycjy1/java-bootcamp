package sec07_exam_anonymousImplements;

public class ActionExample {

	public static void main(String[] args) {
		
		Action action = new Action() {
			
			int a = 10;
			//익명구현클래스, 1회성 사용용도로 거의 사용한다.
			//특히 UI이벤트처리나 안드로이드 프로그래밍에서 자주 등장한다.
			
			public void method() {
				System.out.println("익명구현객체 자체 메서드, 멤버변수 값 : "+this.a);
			}
			
			@Override
			public void work(int a) {
				this.method();
				System.out.println(a+" 복사를 합니다.");
			}
			
		};

		//action.method();
		action.work(100);
		
		//람다식
		//Action action1 = (a) -> {System.out.println(a+"복사를 합니다.람다식으로 구현한 ㅇ");
	
	}

}
