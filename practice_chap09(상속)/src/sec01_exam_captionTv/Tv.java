package sec01_exam_captionTv;

//조상클래스(부모,super클래스) 멤버갯수 : 5개
public class Tv {

		boolean power;
		int channel;
		
		public Tv() {
			System.out.println("조상클래스 생성자 호출");
		}


		public void power() {
			this.power = !power;
		}

		public void channelup() {
			++this.channel;
		}
		public void channeldown() {
			--this.channel;
		}
		
}
