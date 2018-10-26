package sec04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{ //객체의 복제를 위해선 Cloneable인터페이스를 반드시 구현해야함

	
	String name;
	int age;
	int[] scores = null;//참조타입
	Car car = null;
	
	//생성자
	public Member(String name,int age,int[] scores,Car car) {
		this.name=name;
		this.age=age;
		this.car=car;
		this.scores=scores;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은복제(Object의 clone()메서드를 먼저 호출)
		Member cloned = (Member)super.clone();//this.clone하면 오버플로우뜸
		//Arrays.copyof는 원본 배열을 길이만큼 복사함.
		//참조타입의 경우는 반드시 프로그래머가 복제되는 코드를 삽입을 해줘야 한다.
		//String의 경우는 기본형처럼 써라.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	
	public Member getMember() {
		Member cloned =null;
		
		try {
			cloned = (Member)this.clone();//오버라이딩된 클론을 호출 super.clone은 오브젝트의 clone을 호출
		}
		catch(CloneNotSupportedException e) {}
		
		return cloned; 
	}
	
	
	
	
	
}
