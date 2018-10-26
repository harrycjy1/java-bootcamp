package sec03_exam_singleinheritance;

public class TVCRExample {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();
		Tv tv = new Tv();
		
		tv.power();
		
		tvcr.power();
		
		System.out.println(tvcr.getChannel());
		System.out.println(tvcr.channel);
		
		tvcr.vcr.play();//권장하지않는 방법 밑에랑 같음 이미 vcr클래스를 TVCR이 멤버변수로 선언했기때문
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
		tvcr.channelup();
		tvcr.channeldown();

	}

}
