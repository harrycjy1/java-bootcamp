package sec10_exam_thread_yield;

public class ThreadB extends Thread{

		public boolean stop = false;
		public boolean work = true;
		
		@Override
		public void run() {
		
			//���ѷ���
			while(!stop) {
				if(work) {
					//�ʹ� ���� �����ϴϱ� ����
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {}
				 System.out.println("ThreadB �۾� ����");

				}
				else {
					//���ǹ��� �ݺ��� �������� �ٸ������忡�� �纸
					//(���� �켱������ �� �̻��� ������ ����)
					Thread.yield();
				}
				
			}
			System.out.println("ThreadB ����");
		}
}