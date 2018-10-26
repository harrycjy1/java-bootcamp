package sec_verify11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableExample {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		SumThread sum = new SumThread();
		
		Future<Integer> future = es.submit(sum);
		
		try {
			Integer result =future.get();
			System.out.println("[작업처리 결과] : "+result);
		} catch (InterruptedException | ExecutionException e) {}
		
		es.shutdown();

	}

}
