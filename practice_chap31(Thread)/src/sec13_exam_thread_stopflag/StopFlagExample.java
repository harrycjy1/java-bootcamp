package sec13_exam_thread_stopflag;

public class StopFlagExample {

	public static void main(String[] args) {
		
			PrintThread printThread = new PrintThread();
			printThread.start();
			
			//���ν����� 1�� ������ PrintThread�� stop�÷��׷� �������� ������.
			//������ ���������� �����带 �����Ҷ� �Ͻ����� ���·� ���� �����ϴ� ����� ������ �ʴ´�.
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			printThread.setStop(true);

	}

}
