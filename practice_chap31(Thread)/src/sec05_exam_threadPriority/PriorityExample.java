package sec05_exam_threadPriority;

public class PriorityExample {

	public static void main(String[] args) {
		
			
			for(int i=1; i<=10; i++) {
				Thread thread = new CalcThread("Thread : "+i);
				
				//1~9�����ǽ�����
				if(i != 10) {
					thread.setPriority(Thread.MIN_PRIORITY);//�켱���� ���� ���� ����
					//thread.setPriority(1);
				}
				else
					thread.setPriority(Thread.MAX_PRIORITY);//�켱���� ���� ���� ����
			thread.start();
			}
			
	}

}


/*
 * �켱������ 10���� �־��� �ϳ�, ��ġ�� �󵵰� ������ �� ���� �۾��� �����ٰ�� ������� ������ �ڹٴ� ��ȯ�Ҵ����� �����ϹǷ�,
 * CPU�� ���¿� ���� �޶�����.
 * 
 * */
 