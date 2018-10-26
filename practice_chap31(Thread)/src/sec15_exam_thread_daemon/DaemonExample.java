package sec15_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread auto = new AutoSaveThread();
		
		auto.setDaemon(true);
		auto.start();
		
		if(auto.isDaemon())
			System.out.println("auotoSaveThread�� ���󽺷��� �Դϴ�.");
			//���ν����尡 5�ʵ��� �����ϸ� daemon�������� autoSaveThread()��
			//����ǰ� ���ν����尡 ����Ǹ� ���̻� autoSaveThread�� ������ �ȵȴ�.
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		
		System.out.println("���ν����� �����");
		
	}

}
