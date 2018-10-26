package sec02_exam_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍"); //"프"가 시작되는 위치를 리턴
		
		System.out.println(location);
		
		//찾기 기능할때 자주 쓰인다.(사전이나 문서등)
		//"자바"를 포함하고 있는지를 확인할대 쓰이는 코드
		
		if(subject.indexOf("자바")!=-1) { //자바가 없는 문자열일경우 indexOf메서드는 -1을 리턴
			System.out.println("자바와 관련된 책이군요");
		}
		else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	}

}
