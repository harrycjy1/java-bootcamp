package sec06_exam_thread_unsynchronized;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;//�ʱ�ȭ
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		//���� �������� ������ �̸��� memory���� ���
		System.out.println(Thread.currentThread().getName() +" : "+this.memory);
	}
	
}
