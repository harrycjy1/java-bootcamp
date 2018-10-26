package sec07_exam_thread_synchronized;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	//����ȭ �޼���, Ȯ���� ������ü�� �����ϱ� ���ؼ� user1�� ���� �����ϰ� ��������,
	//user2�� �����ϹǷ� �ӵ��� ���������� �������� �ŷڼ��� ������ �� �ִ�.
	public synchronized void setMemory(int memory) {
		this.memory = memory;//�ʱ�ȭ
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		//���� �������� ������ �̸��� memory���� ���
		System.out.println(Thread.currentThread().getName() +" : "+this.memory);
	}
	
}
