package sec03_exam_singleinheritance;

public class TVCR extends Tv{
	
		Vcr vcr = new Vcr();
		
		int channel = 20;
		int counter = vcr.counter;

		
		public TVCR() {
			super();
			System.out.println("TVCR클래스 생성자 호출");
		}
		//this는 객체자신을 가리킨다. super는 조상클래스의 멤버를 지칭할 때 쓴다.
		
		public int getChannel() {
			return this.channel;
		}
		public void play() {
			vcr.play();
		}
		public void stop() {
			vcr.stop();
		}
		public void rew() {
			vcr.rew();
		}
		public void ff() {
			vcr.ff();
		}
		//조상메서드를 오버라이딩, 선언부는 항상 가아야한다.(중요함)
		//상속관계에서 오버라이딩이 이루어져야한다.
		@Override
		public void power() {
			this.power = !power;
			System.out.println("자손클래스 TVCR의 power매서드를 호출하였습니다.");
			super.power(); //Tv의 power()를 호출한 것!
		}

}
