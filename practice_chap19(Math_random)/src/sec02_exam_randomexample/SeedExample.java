package sec02_exam_randomexample;

import java.util.Random;

public class SeedExample {

	public static void main(String[] args) {
	
		//math.random()과 Random클래스의 가장 큰 차이점은 종자값(Seed)를 설정 할수 있는가의 차이
		//Random에서 종자값을 설정하면, 항상 같은 난수를 같은 순서대로 반환한다는 것
		//public random(){this(system.currentTimeMillis());}의 생성자 호출
		
		Random rand1 = new Random();
		Random rand2 = new Random(1);
		Random rand3 = new Random(2);

		
		System.out.println("= rand1(항상 다른값 반환) =");
		
		for(int i=0; i<5; i++){
			int num = Math.abs(rand1.nextInt()%10)+1;
			System.out.println(num);
		}
		
		System.out.println();
		//rand2는 항상 같은 값의 난수만 반환한다.
		System.out.println("=rand2(항상 같은 값 반환) =");
		
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand2.nextInt()%10);
		}
		System.out.println("=rand3(항상 같은 값 반환) =");
		
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand3.nextInt()%10);
		}
	
	
	}
}
