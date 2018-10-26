package sec02_exam_SuperTest;

public class Child extends Parent{
	
	int x =100;
	
	
	public void method() {
		System.out.println("현재 인스턴스의 x = "+ x);
		System.out.println("자손클래스 : this.x = "+this.x);
		System.out.println("조상클래스  : super.x = "+super.x);
	}

	
	@Override //object클래스의 toString메서드를 오버라이딩 한것.
	public String toString() {
		return "메롱";
	}
}
