package sec01_exam_captionTv;

public class CaptionTv extends Tv{
	
		boolean caption;
		
		public CaptionTv() {
				super();
				System.out.println("�ڼ�Ŭ���������� ȣ��");
		}
		
		public void displayCaption(String text) {
			//1��° ȣ��ÿ� false, 2��° ȣ��ÿ��� true
			//ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			
			if(this.caption)
				System.out.println(text);
		}
	
}
