package sec16.exam01_thread_group;

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
