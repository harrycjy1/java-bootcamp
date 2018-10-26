package sec02_exam_RepairableExample;

public class DropShip extends AirUnit implements Repairable{

	
	
	public DropShip() {
		super(125);
		System.out.println(this.toString() + "�� HP�� "+ this.MAX_HP+"�Դϴ�. ��~!");
		hitpoint = this.MAX_HP;
		
	}
	
	//�Ű����� Ÿ������ Repairable�������̽��� ���Դ�. �� �ǹ̴� �����ΰ�?
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		if(r instanceof Unit) {
			
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "�� "+ Damage + "��ŭ �������� �Ծ����ϴ� !");
			System.out.println(unit.toString() + "�� ���� HP�� "+ (unit.MAX_HP-Damage)+"�Դϴ�!");
			System.out.println(unit.toString() + "�� ������ �ʿ��մϴ�. ��~!");
			unit.hitpoint -= Damage;
		}
		
	}

	
	@Override
	public String toString() {
	
	return "Dropship";
	}





}
