package sec06_verify;

public class Animal {

	
	String 		name;
	int 		age;
	
	Animal(){}
	
	Animal(String name){
		this.name=name;
	}
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	/*int print() {
		int result = this.age;
		return result;
		
	}
	
	String print(String name,int age) {
		String result = name;
		return result;
	}*/
	
	 //����ü ���ִ°ų� �ù� �̰�
	
	@Override
	public String toString() {
		String str = "�� ������ �̸��� "+this.name+"�̸�, ���̴� "+this.age+"�Դϴ�.";
		return str;
	}
	
	
	
	
	
	
}
