package sec03_exam_singleinheritance;

//����Ŭ����(�θ�,superŬ����) ������� : 5��
public class Tv {

		boolean power;	
		int channel = 10;
		
		public Tv() {
			super();
			System.out.println("Tv����Ŭ���� ������ ȣ��");
		}


		public void power() {
			this.power = !this.power;
			System.out.println("����Ŭ���� Tv�� power�޼��带 ȣ���Ͽ����ϴ�.");
		}

		public void channelup() {
			++this.channel;
			System.out.println("����Ŭ���� Tv�� channelup�޼��带 ȣ���Ͽ����ϴ�.");
		}
		public void channeldown() {
			--this.channel;
			System.out.println("����Ŭ���� Tv�� channeldown�޼��带 ȣ���Ͽ����ϴ�.");
		}
		
}
