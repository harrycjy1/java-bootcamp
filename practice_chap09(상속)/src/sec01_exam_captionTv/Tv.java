package sec01_exam_captionTv;

//����Ŭ����(�θ�,superŬ����) ������� : 5��
public class Tv {

		boolean power;
		int channel;
		
		public Tv() {
			System.out.println("����Ŭ���� ������ ȣ��");
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
