package sec08_verify;

public class UnitExample {

	public static void main(String[] args) {
		Unit[] units = new Unit[] {
				 					new AirForce(),
				 					new AirForce(),
				 					new Navy(),
				 					new Army(),
				 					new Army()
													};
		
		
		if(units[0] instanceof AirForce) {
			units[0].setName("�� 1���� �����");
			units[0].attack();
			((AirForce)units[0]).bombing();
		}
		if(units[1] instanceof AirForce) {
			units[1].setName("��38������������");
			units[1].attack();
			((AirForce)units[1]).bombing();
		
		}
		if(units[2] instanceof Navy) {
			units[2].setName("���� ��������");
			units[2].attack();
			((Navy)units[2]).incleus();
		
		}
		if(units[3] instanceof Army) {
			units[3].setName("��ȣ�δ�");
			units[3].attack();
			((Army)units[3]).tank();
		
		}
		if(units[4] instanceof Army) {
			units[4].setName("������ǳ�δ�");
			units[4].attack();
			((Army)units[4]).tank();
		
		}
	
	
	}

}