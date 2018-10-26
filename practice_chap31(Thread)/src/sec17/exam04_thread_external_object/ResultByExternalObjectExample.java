package sec17.exam04_thread_external_object;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalObjectExample {

	public static void main(String[] args) {
	
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업처리 요청]");
		
		//내부클래스
		class Task implements Runnable{
			//외부객체의 참조를 얻기 위해 선언
			Result result;
			//생성자
		public Task(Result result) {
				this.result=result;
			}
			@Override
			public void run() {
				int sum=0;
				for(int i=1; i<=10; i++) {
					sum+=i;
				}
				//스레드에 의해서 계산 되어진 값이 외부객체인 result의 
				//addValue()를 호출하여 acculvalue에 누적된다
				result.addValue(sum);
				System.out.println("현재 실행 스레드 이름 : "+Thread.currentThread().getName()+"\n"
						+"작업한 결과 : "+ result.getValue());
				System.out.println();
				
			}
		}
		
		Result result = new Result(); //공유객체 생성
		//작업객체 생성(같은 객체)
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		//작업요청
		Future<Result> future1 = es.submit(task1, result);
		try {
			result = future1.get(); //task1에 대한 결과
		} catch (InterruptedException | ExecutionException e1) {}
		
		
		Future<Result> future2 = es.submit(task2, result);
		//아래의 get()메스더를 하나라도 처리를 해주지않으면 올바른 결과가 나오지 아니한다.
		//즉 스레드의 처리통보(블로킹)를 받아야 비로소 온전한 결과를 얻을수가 있다.
		
		try {
			
			
			result = future2.get();	//task2에 대한 결과
			
			System.out.println("[작업처리 결과 : "+result.accumValue+"]");
			System.out.println("[작업처리 완료]");
		} catch (InterruptedException | ExecutionException e) {}
		
		System.out.println("현재 실행 스레드 이름 : "+Thread.currentThread().getName()+"\n"
				+"작업한 결과 : "+ result.getValue());
		es.shutdown();
		
	}

}
