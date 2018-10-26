package sec02_verify;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
		System.out.println("Audio ������ �ִ�ġ ����"+MAX_VOLUME+"�Դϴ�. ������"+MAX_VOLUME+"���� �����մϴ�!");
		System.out.println("���� Audio ���� : "+ MAX_VOLUME);
		}
		else if(volume<MIN_VOLUME) {
		System.out.println("Audio ������ �ִ�ġ ����"+MIN_VOLUME+"�Դϴ�. ������"+MIN_VOLUME+"���� �����մϴ�!");
		System.out.println("���� Audio ���� : "+ MIN_VOLUME);
		}
		

	}
	
	public void setMute(boolean mute) {
		if(mute==true) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	
	
}
