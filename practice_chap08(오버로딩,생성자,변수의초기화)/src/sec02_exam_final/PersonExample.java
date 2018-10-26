package sec02_exam_final;

public class PersonExample {

	public static void main(String[] args) {
		
		
			//매개변수가 있는 생성자를 호출하는 것!
			Person p1 = new Person("123456-1234567", "계백");
			
			System.out.println(p1.ssn);
			System.out.println(p1.nation);
			System.out.println(p1.name);
			
			//p1.nation = "usa"; 			상수로 Korea 선언되어 있음.(상수는 불변)
			//p1.ssn = "654321-7654321";	위에 123456-1234567이 상수로 선언.(상수는 불변)
			p1.name = "을지문덕";
			
			
			
			
	}

}
