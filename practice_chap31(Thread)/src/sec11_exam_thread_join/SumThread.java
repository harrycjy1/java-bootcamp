package sec11_exam_thread_join;

public class SumThread extends Thread	{
	
	private long sum;
	
	public long getSum() {
		return this.sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		//�ϸ����� �����Ͽ� ����.
		for(int i=0; i<=10000; i++) {
			this.sum += i;
		}
	}
}
