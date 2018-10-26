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
	
	 //도대체 왜있는거냐 시발 이건
	
	@Override
	public String toString() {
		String str = "이 동물의 이름은 "+this.name+"이며, 나이는 "+this.age+"입니다.";
		return str;
	}
	
	
	
	
	
	
}
