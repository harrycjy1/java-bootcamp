package sec03_verify;

public class smartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

	@Override
	public void smartskill() {
		System.out.println("Smart기능을 시작합니다.");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute==true) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
		System.out.println("스마트 TV의 볼륨의 최대치 값은"+MAX_VOLUME+"입니다. 볼륨을"+MAX_VOLUME+"으로 지정합니다!");
		System.out.println("현재 TV 볼륨 : "+ MAX_VOLUME);
		}
		else if(volume<MIN_VOLUME) {
		System.out.println("스마트 TV의 볼륨의 최대치 값은"+MIN_VOLUME+"입니다. 볼륨을"+MIN_VOLUME+"으로 지정합니다!");
		System.out.println("현재 TV 볼륨 : "+ MIN_VOLUME);
		}
		

	}

	
	
	
}
