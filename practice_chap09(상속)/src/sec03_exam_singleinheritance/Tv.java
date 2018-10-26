package sec03_exam_singleinheritance;

//조상클래스(부모,super클래스) 멤버갯수 : 5개
public class Tv {

		boolean power;	
		int channel = 10;
		
		public Tv() {
			super();
			System.out.println("Tv조상클래스 생성자 호출");
		}


		public void power() {
			this.power = !this.power;
			System.out.println("조상클래스 Tv의 power메서드를 호출하였습니다.");
		}

		public void channelup() {
			++this.channel;
			System.out.println("조상클래스 Tv의 channelup메서드를 호출하였습니다.");
		}
		public void channeldown() {
			--this.channel;
			System.out.println("조상클래스 Tv의 channeldown메서드를 호출하였습니다.");
		}
		
}
