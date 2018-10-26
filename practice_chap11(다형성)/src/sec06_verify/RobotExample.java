package sec06_verify;

public class RobotExample {

	
	public static void action(Robot a) {
		if(a instanceof DanceRobot) {
			((DanceRobot) a).dance();
		}
		
		if(a instanceof SongRobot) {
			((SongRobot) a).Song();
		}
		
		if(a instanceof DrawRobot) {
			((DrawRobot) a).draw();
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		action(new DanceRobot());
		action(new SongRobot());
		action(new DrawRobot());
		
		
		
		
		
		
	}

}
