package sec17.exam04_thread_external_object;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalObjectExample {

	public static void main(String[] args) {
	
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾�ó�� ��û]");
		
		//����Ŭ����
		class Task implements Runnable{
			//�ܺΰ�ü�� ������ ��� ���� ����
			Result result;
			//������
		public Task(Result result) {
				this.result=result;
			}
			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++) {
					sum+=i;
				}
				//�����忡 ���ؼ� ��� �Ǿ��� ���� �ܺΰ�ü�� result�� 
				//addValue()�� ȣ���Ͽ� acculvalue�� �����ȴ�
				result.addValue(sum);
				System.out.println("���� ���� ������ �̸� : "+Thread.currentThread().getName()+"\n"
						+"�۾��� ��� : "+ result.getValue());
				System.out.println();
				
			}
		}
		
		Result result = new Result(); //������ü ����
		//�۾���ü ����(���� ��ü)
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		//�۾���û
		Future<Result> future1 = es.submit(task1, result);
		try {
			result = future1.get(); //task1�� ���� ���
		} catch (InterruptedException | ExecutionException e1) {}
		
		
		Future<Result> future2 = es.submit(task2, result);
		//�Ʒ��� get()�޽����� �ϳ��� ó���� ������������ �ùٸ� ����� ������ �ƴ��Ѵ�.
		//�� �������� ó���뺸(���ŷ)�� �޾ƾ� ��μ� ������ ����� �������� �ִ�.
		
		try {
			
			
			result = future2.get();	//task2�� ���� ���
			
			System.out.println("[�۾�ó�� ��� : "+result.accumValue+"]");
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (InterruptedException | ExecutionException e) {}
		
		System.out.println("���� ���� ������ �̸� : "+Thread.currentThread().getName()+"\n"
				+"�۾��� ��� : "+ result.getValue());
		es.shutdown();
		
	}

}
