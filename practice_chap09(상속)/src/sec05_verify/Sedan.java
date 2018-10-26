package sec05_verify;

public class Sedan extends Car{

	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	@Override
	public String toString() {
		
		return "승용차 속도는 "+getSpeed()+"km, 색깔은 "+getColor()+"색, 좌석수는 "+this.seatNum+"개 입니다.";
	}
	
	
	
	
	
	
	
	
	
	
}
