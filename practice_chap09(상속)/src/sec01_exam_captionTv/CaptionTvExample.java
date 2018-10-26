package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;	//조상클래스로부터 상속받은 멤버
		ctv.channelup();	//조상 클래스로부터 상속받은 멤버, channel을 1증가시킴
		
		System.out.println("현재채널 : "+ ctv.channel);
		ctv.displayCaption("캡션기능 출력 메시지 : hello, World");
		
		ctv.caption = true;//true값 안주면 골백번 찍어도 안나온다.
		ctv.displayCaption("캡션기능 출력 메시지 : hello, World");
		

		
	}
}
