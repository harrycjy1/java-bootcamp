package sec02_verify;

public class Korean {

	String		nation; 		
	String 		name;
	int 		height;
	int			age;
	String		character;
	
	
	
	Korean	(String nation, String name, int height, int age, String character){
		this.nation = nation;
		this.name = name;
		this.height = height;
		this.age = age;
		this.character = character;
		
		System.out.println("국적 : "+this.nation);
		System.out.println("이름 : "+this.name);
		System.out.println("키 : "+this.height);
		System.out.println("나이 : "+this.age);
		System.out.println("특징 : "+this.character);
		
	}
	
	
	
	
	
	
}
