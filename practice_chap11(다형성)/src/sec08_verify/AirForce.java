package sec08_verify;

public class AirForce extends Unit{

	AirForce(){
		super();
	}
	
	//오버라이딩
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> 이륙");
		System.out.println(this.getName()+">> 공중공격");
		
	}
	
	public void bombing() {
		System.out.println(this.getName()+">> 폭격");
	}
	
}