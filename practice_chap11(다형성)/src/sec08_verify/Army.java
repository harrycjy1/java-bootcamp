package sec08_verify;

public class Army extends Unit{

	Army(){
		super();
	}
	
	//�������̵�
	public void attack() {
		super.attack();
		System.out.println(this.getName()+">> �������");
		
	}
	
	public void tank() {
		System.out.println(this.getName()+">> ��ũ����");
	}
	
}