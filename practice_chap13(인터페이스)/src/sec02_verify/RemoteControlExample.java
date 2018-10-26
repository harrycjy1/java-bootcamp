package sec02_verify;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl tv=new Television();
		RemoteControl au=new Audio();
		
		tv.turnOn();
		tv.setVolume(13);
		tv.setVolume(-2);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println();
		au.turnOn();
		au.setVolume(15);
		au.setVolume(-3);
		au.setMute(true);
		au.setMute(false);
		au.turnOff();
		RemoteControl.changeBattery();
		
	
		
	}

}
