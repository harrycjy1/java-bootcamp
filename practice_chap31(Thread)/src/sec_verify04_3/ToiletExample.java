package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {
		
		Toilet to = new Toilet();
		
		Thread t1 = new ToiletUsingThread(to, "�ƹ���");
		t1.start();
		
		Thread t2 = new ToiletUsingThread(to, "��");
		t2.start();
		
		Thread t3 = new ToiletUsingThread(to, "�Ƶ�");
		t3.start();
		
		Thread t4 = new ToiletUsingThread(to, "��Ӵ�");
		t4.start();

	}

}
