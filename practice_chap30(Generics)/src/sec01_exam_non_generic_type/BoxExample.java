package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//아래 코드를 이해하는 것은 너무나 중요하다
		Box box = new Box();
		
		box.set("홍길동");
		String name = (String)box.get();
		System.out.println(name);
		
		//역시 위와 마찬가지이다
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}
}
