package sec15_exam_thread_daemon;

public class AutoSaveThread  extends Thread{
	
	public void save() {
		System.out.println("�۾������� ������");
	}
	
	@Override
	public void run() {
		//1�� ������ save()�޼��� ȣ��
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {break;}
			this.save();
		}
	}
	
}
