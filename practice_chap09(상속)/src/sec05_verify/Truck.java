package sec05_verify;

public class Truck extends Car{
	
	
	int capacity;
	
	int getCapacity() {
		return capacity;
	}
	
	
	@Override
	public String toString() {
		
		return "트럭 속도는 "+ getSpeed()+"km, 색깔은 "+ getColor()+"색, 적재량은 "+this.capacity+"톤 입니다.";
	}


	
	

}
