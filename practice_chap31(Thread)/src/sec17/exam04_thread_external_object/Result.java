package sec17.exam04_thread_external_object;

public class Result {
	
	int accumValue;
	//������ü�̱� ���� ��, ���� �����尡 �����Ͽ� ����� �� �����Ƿ�
	//����ȭ�� �ʼ����̴�.
	
	public synchronized void addValue(int value) {
		this.accumValue+=value;
	}
	
	public synchronized int getValue() {
		return this.accumValue;
	}
}
