package sec08_verify;

public class Unit {

	private String  name;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//������
	public Unit() {
		this("");
	}
	
	public Unit(String name) {
		this.name= name;
	}
	
	//�޼���
	public void attack() {
		System.out.println(this.getName()+">> �����غ�");
	}
}
