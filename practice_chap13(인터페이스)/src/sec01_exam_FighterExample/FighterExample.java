package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
	Fighter f = new Fighter();
	
	
	if(f instanceof Unit) {
		System.out.println("f는 Unit클래스의 자손입니다.");
	}
	if(f instanceof Fightable) {
		System.out.println("f는 Fightable인터페이스를 구현했습니다.");
	}
	if(f instanceof Movable) {
		System.out.println("f는 Movable인터페이스를 구현했습니다.");
	}
	if(f instanceof Attackable) {
		System.out.println("f는 Attackable인터페이스를 구현했습니다.");
	}
	if(f instanceof Object) {
		System.out.println("f는 Object인터페이스를 구현했습니다.");
	}
	
	//재정의된 추상메서드 호출
	f.move(0,0);
	f.attack(null);






	}
	

}
