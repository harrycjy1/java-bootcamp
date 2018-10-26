package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {
		
		
		StudentAnonymous a = new StudentAnonymous();
		a.field.wake();
		a.method1();
		
		
		a.method2(new Student("김연아") {
			public void study() {
				System.out.println(name+"이 공부합니다.");
			}
			@Override
			public void wake() {
				System.out.println("================================");
				System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
				System.out.println(name+"가 4시에 일어납니다.");
				study();
				System.out.println("================================");
			}
		});
		

	}

}
