package sec06_verify;

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		
		System.out.println(ani);
		
		//기본생성자 호출 뭘 넣어도 null 에 0이나옴

		Animal ani1 = new Animal("사자");
		
		System.out.println(ani1);
		//생성자 매개변수 1개 뭘 넣어도 사자,0살로 나옴
		
		Animal ani2 = new Animal("호랑이", 5);
		System.out.println(ani2);
	
	
	

	
	
	}

}
