package sec06_verify;

public class MyTvClass {

	boolean 	isPowerOn;
	int 		channel;
	int 		volume;
	int 		prevChannel;
	int 		prevVolume;
	final int 	MAX_VOLUME = 100;
	final int 	MIN_VOLUME = 0;
	final int 	MAX_CHANNEL = 100;
	final int 	MIN_CHANNEL = 1;
	
	

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL||channel<MIN_CHANNEL) {
			System.out.println("ä���� 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�!");
		}
		prevChannel=this.channel;
		this.channel=channel;
		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME||volume<MIN_VOLUME) {
			System.out.println("ä���� 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�!");
		}
		this.prevVolume = this.volume;
		this.volume=volume;
	}
	public int getPrevChannel() {
		return prevChannel;
	}
	
	public int getPrevVolume() {
		return prevVolume;
	}
	
	
	
	
	
	
	
	
}
