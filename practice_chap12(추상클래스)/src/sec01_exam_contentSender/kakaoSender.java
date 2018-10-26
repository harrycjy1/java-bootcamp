package sec01_exam_contentSender;

public class kakaoSender extends ContentSender{

	
	String content;
	
	public kakaoSender(String title, String nm, String content) {
		super(title,nm);
		this.content=content;
	}
	
	@Override
	void sendMsg(String recipient) {
		System.out.println("���� : "+this.title);
		System.out.println("�̸� : "+this.nm);
		System.out.println("���� : "+this.content);
		System.out.println("�޴� ��� : "+ recipient);
		
	}
	
}
