package sec08_verify;

public class AirForce extends Unit{

	AirForce(){
		super();
	}
	
	//�������̵�
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> �̷�");
		System.out.println(this.getName()+">> ���߰���");
		
	}
	
	public void bombing() {
		System.out.println(this.getName()+">> ����");
	}
	
}