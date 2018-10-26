package sec08_verify;

public class Navy extends Unit{

	Navy(){
		super();
	}
	
	//오버라이딩
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> 어뢰 발사");
		
	}
	
	public void incleus() {
		System.out.println(this.getName()+">> 지상상륙");
		System.out.println(this.getName()+">> 잠수정 출동");
	}
	
}