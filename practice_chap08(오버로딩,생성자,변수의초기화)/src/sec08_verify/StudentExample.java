package sec08_verify;

public class StudentExample {

	public static void main(String[] args) {
		
		Student stu= new Student(); //기본생성자 호출
		
		System.out.println("이름 : "+ stu.name);
		System.out.println("총점 : "+ stu.getTotal());
		System.out.println("평균 : "+ stu.getAverage());
		
		
	}

}
