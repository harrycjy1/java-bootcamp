package sec08_verify;

public class Navy extends Unit{

	Navy(){
		super();
	}
	
	//�������̵�
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> ��� �߻�");
		
	}
	
	public void incleus() {
		System.out.println(this.getName()+">> ������");
		System.out.println(this.getName()+">> ����� �⵿");
	}
	
}