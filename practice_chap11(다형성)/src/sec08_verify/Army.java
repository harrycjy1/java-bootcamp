package sec08_verify;

public class Army extends Unit{

	Army(){
		super();
	}
	
	//오버라이딩
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> 지상공격");
		
	}
	
	public void tank() {
		System.out.println(this.getName()+">> 탱크공격");
	}
	
}