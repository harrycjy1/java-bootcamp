package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;	//����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelup();	//���� Ŭ�����κ��� ��ӹ��� ���, channel�� 1������Ŵ
		
		System.out.println("����ä�� : "+ ctv.channel);
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : hello, World");
		
		ctv.caption = true;//true�� ���ָ� ���� �� �ȳ��´�.
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : hello, World");
		

		
	}
}
