package sec02_exam;

public class Tv {

		String color;
		boolean power;
		int channel;
		
		//멤버 메서드(함수)
		//Tv를 켜거나 끄는 기능을 하는 메서드
		public void power() {
			this.power = !this.power;
		}
		
		public void channelup() {
			++this.channel;
			
		}
		
		public void channeldown() {
			if(this.channel <0) {
				System.out.println("채널은 음수값이 없습니다.");
			}
			else {
				--this.channel;
			}
			return;
		}













}
