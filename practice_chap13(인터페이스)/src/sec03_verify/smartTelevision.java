package sec03_verify;

public class smartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}

	@Override
	public void smartskill() {
		System.out.println("Smart����� �����մϴ�.");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute==true) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
		System.out.println("����Ʈ TV�� ������ �ִ�ġ ����"+MAX_VOLUME+"�Դϴ�. ������"+MAX_VOLUME+"���� �����մϴ�!");
		System.out.println("���� TV ���� : "+ MAX_VOLUME);
		}
		else if(volume<MIN_VOLUME) {
		System.out.println("����Ʈ TV�� ������ �ִ�ġ ����"+MIN_VOLUME+"�Դϴ�. ������"+MIN_VOLUME+"���� �����մϴ�!");
		System.out.println("���� TV ���� : "+ MIN_VOLUME);
		}
		

	}

	
	
	
}
