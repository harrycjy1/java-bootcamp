package sec02_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable{

	//static������ ����(unit�� �� Ŭ������ ���������� �θ��� ���⶧����)
	
	public SCV() {
		super(60);
		System.out.println(this.toString() + "�� HP�� "+ this.MAX_HP+"�Դϴ�. ��~!");
		hitpoint = this.MAX_HP;
		//static��� unit�� ��������� hitpoint ���
		
	}
	
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		if(r instanceof Unit) {
			
			Unit unit = (Unit)r;
			System.out.println(unit.toString() + "�� "+ Damage + "��ŭ �������� �Ծ����ϴ� !");
			System.out.println(unit.toString() + "�� ���� HP�� "+ (unit.MAX_HP-Damage)+"�Դϴ�!");
			System.out.println(unit.toString() + "�� ������ �ʿ��մϴ�. ��~!");
			unit.hitpoint -= Damage;
			//����ü�� = �ִ�ü��-������ ���� ��Ʈ����Ʈ�� ����.
		}
		
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count=0;
			Unit u = (Unit)r;
			System.out.println("���� ü��: "+u.hitpoint);//����ü������ ������ ��Ʈ����Ʈ������ �־����.
			
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
				count++;
			}
			System.out.println(u.toString()+"�� HP�� "+count+"��ŭ ������ �������ϴ�.");
		}
	}

	@Override
	public String toString() {
		
		return "SCV";
	}





}
