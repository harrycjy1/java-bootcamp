package sec05_verify;

public class Truck extends Car{
	
	
	int capacity;
	
	int getCapacity() {
		return capacity;
	}
	
	
	@Override
	public String toString() {
		
		return "Ʈ�� �ӵ��� "+ getSpeed()+"km, ������ "+ getColor()+"��, ���緮�� "+this.capacity+"�� �Դϴ�.";
	}


	
	

}
