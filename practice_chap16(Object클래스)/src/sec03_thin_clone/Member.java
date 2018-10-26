package sec03_thin_clone;

public class Member implements Cloneable{

	String id;
	String name;
	String password;
	int age;
	boolean adult;
	int[] scores = null;//����Ÿ��
	
	//������
	public Member(String id,String name,String password,int age, boolean adult,int[] scores) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
		this.scores=scores;
	}
	
	//���� ������ �ν��Ͻ��� ����
	public Member getMember() {
		Member cloned =null;
		try {
			cloned = (Member)this.clone();
		}
		catch(CloneNotSupportedException e) {}
		
		return cloned; //���� ����(thin cloned)�� Member�ν��Ͻ� ������
	}
	
	
	
	
	
}
