package sec03_verify;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		smartTelevision tv = new smartTelevision();
		
		tv.turnOn();
		tv.setVolume(13);
		tv.setVolume(-23);
		tv.setMute(true);
		tv.setMute(false);
		tv.smartskill();
		tv.search("www.naver.com");
		

	}

}
