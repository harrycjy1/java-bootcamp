package sec01_exam_contentSender;

public class kakaoSender extends ContentSender{

	
	String content;
	
	public kakaoSender(String title, String nm, String content) {
		super(title,nm);
		this.content=content;
	}
	
	@Override
	void sendMsg(String recipient) {
		System.out.println("제목 : "+this.title);
		System.out.println("이름 : "+this.nm);
		System.out.println("내용 : "+this.content);
		System.out.println("받는 사람 : "+ recipient);
		
	}
	
}
