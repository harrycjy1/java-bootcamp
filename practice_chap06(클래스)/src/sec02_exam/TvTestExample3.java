package sec02_exam;

public class TvTestExample3 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		int i=0;
		
		//Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		
		for(i=0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();
			tvArr[i].channel = i+10;//tvArr[i]�� channel�� ���� 10����
			System.out.println(tvArr[i].channel);
		}
		
		for(i=0; i<tvArr.length; i++) {
			tvArr[i].channelup();//tvArr[i]�� �޼��带 ȣ��. ä���� 1����
			System.out.println("tvArr["+i+"].channel ="+tvArr[i].channel);
			
		}
		System.out.println();
		
		//���� for��
		//������ Ÿ�� : ������ ���
			for(Tv tv:tvArr) {
			tv = new Tv();
			tv.channel = 10;//tvArr ���ο� Tv�ν��Ͻ��� ����� channel�� 10�� ����
			System.out.println(tv.channel);
			
		}
	
	
	}
	
}
