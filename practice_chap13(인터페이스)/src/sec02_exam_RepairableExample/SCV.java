package sec02_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable{

	//static변수를 없앰(unit은 각 클래스의 정적변수를 부를수 없기때문에)
	
	public SCV() {
		super(60);
		System.out.println(this.toString() + "의 HP는 "+ this.MAX_HP+"입니다. 썰~!");
		hitpoint = this.MAX_HP;
		//static대신 unit의 멤버변수인 hitpoint 사용
		
	}
	
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		if(r instanceof Unit) {
			
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "가 "+ Damage + "만큼 데미지를 입었습니다 !");
			System.out.println(unit.toString() + "의 현재 HP는 "+ (unit.MAX_HP-Damage)+"입니다!");
			System.out.println(unit.toString() + "의 수리가 필요합니다. 썰~!");
			unit.hitpoint -= Damage;
			//현재체력 = 최대체력-데미지 값을 히트포인트로 설정.
		}
		
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count=0;
			Unit u = (Unit)r;
			System.out.println("현재 체력: "+u.hitpoint);//현재체력으로 설정한 히트포인트변수를 넣어야함.
			
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
				count++;
			}
			System.out.println(u.toString()+"의 HP가 "+count+"만큼 수리가 끝났습니다.");
		}
	}

	@Override
	public String toString() {
		
		return "SCV";
	}





}
