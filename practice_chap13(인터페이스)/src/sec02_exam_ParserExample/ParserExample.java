package sec02_exam_ParserExample;

public class ParserExample {

	public static void main(String[] args) {
	
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("����-1.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("����-2.html");
		
		
		
		
	}

}
