package sec10_exam_thread_yield;


public class YieldExample {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		//�켱������ ���ų� �������� yield()�� �����ϰԲ� �Ǿ�����
		//�׷��� ������ �ʴ�
		//threadB.setpriorty(1);
		//3�ʵ����� ������ �����ϴٰ� ����, ThreadA�� yield()ȣ�������ν�,
		//threadB�� �����ϰ� �ȴ�.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		threadA.work = false;
		//�ٽ� 3���� ThreadB�� yield()ȣ�������ν� ThreadA�� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		threadA.work =true;
		threadB.work = false;
		
		//3���� ThreadA��  ThreadB�� �����ϰ� �ȴ�.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		threadA.stop = true;
		threadB.stop = true;
	}

}
