package sec02_verify;

public class Television implements RemoteControl{

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
		System.out.println("Television ������ �ִ�ġ ����"+MAX_VOLUME+"�Դϴ�. ������"+MAX_VOLUME+"���� �����մϴ�!");
		System.out.println("���� TV ���� : "+ MAX_VOLUME);
		}
		else if(volume<MIN_VOLUME) {
		System.out.println("Television ������ �ִ�ġ ����"+MIN_VOLUME+"�Դϴ�. ������"+MIN_VOLUME+"���� �����մϴ�!");
		System.out.println("���� TV ���� : "+ MIN_VOLUME);
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
