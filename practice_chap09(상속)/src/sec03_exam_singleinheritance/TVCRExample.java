package sec03_exam_singleinheritance;

public class TVCRExample {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();
		Tv tv = new Tv();
		
		tv.power();
		
		tvcr.power();
		
		System.out.println(tvcr.getChannel());
		System.out.println(tvcr.channel);
		
		tvcr.vcr.play();//���������ʴ� ��� �ؿ��� ���� �̹� vcrŬ������ TVCR�� ��������� �����߱⶧��
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
		tvcr.channelup();
		tvcr.channeldown();

	}

}
