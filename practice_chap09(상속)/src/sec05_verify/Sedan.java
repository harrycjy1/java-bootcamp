package sec05_verify;

public class Sedan extends Car{

	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	@Override
	public String toString() {
		
		return "�¿��� �ӵ��� "+getSpeed()+"km, ������ "+getColor()+"��, �¼����� "+this.seatNum+"�� �Դϴ�.";
	}
	
	
	
	
	
	
	
	
	
	
}
