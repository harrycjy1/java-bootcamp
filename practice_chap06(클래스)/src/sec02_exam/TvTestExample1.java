package sec02_exam;

public class TvTestExample1 {

	public static void main(String[] args) {
		
		
		Tv t = new Tv(); //Tv�ν��Ͻ��� �����ϱ����� ���� t���� TV�ν��Ͻ� ����
		t.channel = 7;	 //Tv�ν��Ͻ��� ��� ���� channel�� ���� 7�� �Ѵ�.
		t.channeldown();	//Tv�ν��Ͻ��� �޼��� channeldown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");

	}

}
