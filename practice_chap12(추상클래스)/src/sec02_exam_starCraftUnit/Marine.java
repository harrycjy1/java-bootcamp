package sec02_exam_starCraftUnit;

public class Marine extends Unit{

	
	public Marine() {}
	
	@Override
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("마린의 위치 : "+this.x +", "+this.y+"로 이동함.");
		
	}
	
	public void stimPack() {
		this.str = "공격 모드 : 스팀팩 장전";
		System.out.println(this.str);
	}
	
}
