package sec03_exam_singleinheritance;

public class TVCR extends Tv{
	
		Vcr vcr = new Vcr();
		
		int channel = 20;
		int counter = vcr.counter;

		
		public TVCR() {
			super();
			System.out.println("TVCRŬ���� ������ ȣ��");
		}
		//this�� ��ü�ڽ��� ����Ų��. super�� ����Ŭ������ ����� ��Ī�� �� ����.
		
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
		//����޼��带 �������̵�, ����δ� �׻� ���ƾ��Ѵ�.(�߿���)
		//��Ӱ��迡�� �������̵��� �̷�������Ѵ�.
		@Override
		public void power() {
			this.power = !power;
			System.out.println("�ڼ�Ŭ���� TVCR�� power�ż��带 ȣ���Ͽ����ϴ�.");
			super.power(); //Tv�� power()�� ȣ���� ��!
		}

}
