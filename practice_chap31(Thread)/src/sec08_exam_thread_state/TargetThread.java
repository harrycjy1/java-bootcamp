package sec08_exam_thread_state;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		//20��� ����, ��������̰ų� ������(Runnable)�����̴�.
		for(long i=0; i<200000000; i++) {}
		
		//�Ͻ�����(Timed-Waiting)����
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {}
		
		
		
		//20��� ����, ��������̰ų� ���������
		for(long i=0; i<2000000000; i++) {}
		
	} //����(Terminated)

}
