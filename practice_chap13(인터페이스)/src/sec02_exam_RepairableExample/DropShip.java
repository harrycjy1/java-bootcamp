package sec02_exam_RepairableExample;

public class DropShip extends AirUnit implements Repairable{

	
	
	public DropShip() {
		super(125);
		System.out.println(this.toString() + "의 HP는 "+ this.MAX_HP+"입니다. 썰~!");
		hitpoint = this.MAX_HP;
		
	}
	
	//매개변수 타입으로 Repairable인터페이스가 들어왔다. 이 의미는 무엇인가?
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		if(r instanceof Unit) {
			
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "가 "+ Damage + "만큼 데미지를 입었습니다 !");
			System.out.println(unit.toString() + "의 현재 HP는 "+ (unit.MAX_HP-Damage)+"입니다!");
			System.out.println(unit.toString() + "의 수리가 필요합니다. 썰~!");
			unit.hitpoint -= Damage;
		}
		
	}

	
	@Override
	public String toString() {
	
	return "Dropship";
	}





}
