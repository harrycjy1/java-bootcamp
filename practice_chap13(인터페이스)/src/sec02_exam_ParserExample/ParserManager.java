package sec02_exam_ParserExample;

public class ParserManager {

	/* 	main()이 static이므로 static으로 선언해야한다.
	 * 	아울러 리턴타임이 인터페이스 타입이라는것은 그 인터페이스를
	 * 	구현한 클래스에 한해서 인스턴스를 반환하겠다는 의미이다.
	 */
	 
	
	public static Parseable getParser(String type) {
		
		if(type.equals("XML")) {
			//인스턴스 생성하여 주소값 리턴
			return new XMLParser();
		}
	
	
	else {
		//인터페이스 필드의 다형성
	
		Parseable p = new HTMLParser();
		return p;
	}
	
	}
	
	
	
	
	
	
	
}
