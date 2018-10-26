package sec04_deep_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {
		
		Member original = new Member("홍길동",25,new int[] {90,100},new Car("소나타"));
		Member cloned = original.getMember();	
		//얕은 복제를 했다면 원본객체의 값도 변경되지만, 깊은 복제를 했기 때문에 원본객체의
		//참조형 타입에 영향을 끼치지 않는다.
		
		cloned.car.model="그랜져";
		
		
		
		cloned.scores[0] = 9999;
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : "+original.name);
		System.out.println("age : "+original.age);
		System.out.println(Arrays.toString(original.scores));
		System.out.print("car : "+original.car.model);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드 값]");
		System.out.println("name : "+cloned.name);
		System.out.println("age : "+cloned.age);
		System.out.println(Arrays.toString(cloned.scores));
		System.out.print("car : "+cloned.car.model);
		
	
	
	
	}

}
