package sec07_verify;

public class Bird extends Pet{

	
		String type;
		boolean flightYN;
		
		boolean getflight() {
			if(flightYN==true) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		@Override
		void move() {
			System.out.println("���� ���ư��׿�");
			System.out.print("���� ������ "+this.type+"�̰�, ");
			if(getflight()==true) {
				System.out.println("�� �� �ֽ��ϴ�.");
			}
		}
	
}
