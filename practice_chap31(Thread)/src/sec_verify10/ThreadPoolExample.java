package sec_verify10;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

	static ExecutorService 	createThreadPool() {
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		return es;
	}
	
	public static void main(String[] args) {
	
		ExecutorService es =createThreadPool();
		
		
		GugudanThread gugu = new GugudanThread();
		Future<?> future = es.submit(gugu);
		
		try {
			future.get();
			System.out.println("[구구단 작업완료]");
		} catch (InterruptedException | ExecutionException e) {}
		
		es.shutdown();
		
		
		
	}

}
