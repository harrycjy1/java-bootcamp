package sec08_verify;

public class Unit {

	private String  name;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//생성자
	public Unit() {
		this("");
	}
	
	public Unit(String name) {
		this.name= name;
	}
	
	//메서드
	public void attack() {
		System.out.println(this.getName()+">> 공격준비");
	}
}
