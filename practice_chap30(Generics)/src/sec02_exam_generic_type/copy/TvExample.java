package sec02_exam_generic_type.copy;

public class TvExample {

	public static void main(String[] args) {
				//구체적 타입으로 String을 선택	
				Tv<String> tv1 = new Tv<String>();
				//Tv<String> tv1 = new Tv();
				//이렇게 선언해도 가능하지만 이건 비제네릭코드인 Object의 형태가 된다.
				//TV tv = new Tv();
				//tv1.setT(new Integer(42)); //에러 이유는?
				tv1.setT("LG OLED TV");
				String str = tv1.getT();
				System.out.println("나의 TV는 "+ str);
				
				//타입을 Integer로 선택
				
				Tv<Integer> tv2 = new Tv<Integer>();
				tv2.setT(42);
				Integer inch =tv2.getT();
				System.out.println("TV의 크기는 "+inch+"inch");
	}

}
