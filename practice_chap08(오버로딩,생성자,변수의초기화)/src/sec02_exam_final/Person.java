package sec02_exam_final;

public class Person {

		final String nation = "Korea";
		final String ssn;
		String name;
		
		//final 초기화 방법
		//1. 선언과 동시에 초기화
		//2. 생성자에서 단 한번 초기화 가능
		
		//매개 변수가 있는 생성자
		public Person(String ssn, String name) {
			//this는 객체 자기자신의 주소(참조변수와 동일)
			this.ssn = ssn;
			this.name = name;
		}
	
	
	
}
