package sec01_exam_contentSender;

//�߻�޼��带 �ϳ��� �����ϰ� ������, �װ� �߻�Ŭ������ �ȴ�.
public abstract class ContentSender {

	//�ʵ�
	String title;
	String nm;
	
	public ContentSender(String title, String nm) {
		this.title=title;
		this.nm=nm;
		
	}
	
	//�߻�޼��� -> ����� ���� �����Ǹ� �ؾ�����
	//��μ� �ν��Ͻ��� ���� �� �� �ִ�.
	abstract void sendMsg(String content);
}
