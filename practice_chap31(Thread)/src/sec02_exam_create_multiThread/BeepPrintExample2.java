package sec02_exam_create_multiThread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//���� �����ϴ� ��Ƽ������� �ϴ� 3���� ���
		//���1 --> ��������
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//���2 --> �͸���Ŭ���� �̿�
		
		/*Thread thread = new Thread(new Runnable() {
			
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});*/
		
		//��� 3
		/*���ٽ��̿��Ͽ� �ʰ���ȭ ()�� run�޼����� �Ű������� �ǹ��ϴµ� �Ű������� 1���� ���ٴ°��� �ǹ��Ѵ� 
		{}�� run()�� ������� �ǹ�
		*/
		/*Thread thread1 = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});*/
		
		//Thread thread = new Thread(new BeepTask());
		thread.start(); //run()�� main�����尡 �����϶��������. �̶����� main ������� 
						//beeptask�����尡 ���ÿ� �����, beep�� 5������
		//�Ʒ��� ���ν����尡 ����Ǵ� �κ�
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
