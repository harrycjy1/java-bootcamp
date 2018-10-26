package sec01_exam_captionTv;

public class CaptionTv extends Tv{
	
		boolean caption;
		
		public CaptionTv() {
				super();
				System.out.println("자손클래스생성자 호출");
		}
		
		public void displayCaption(String text) {
			//1번째 호출시에 false, 2버째 호출시에는 true
			//캡션 상태가 on(true)일 때만 text를 보여준다.
			
			if(this.caption)
				System.out.println(text);
		}
	
}
