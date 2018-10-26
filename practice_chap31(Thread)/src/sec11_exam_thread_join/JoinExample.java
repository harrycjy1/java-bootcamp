package sec11_exam_thread_join;

public class JoinExample {

	public static void main(String[] args) {

		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		//sumThread의 run()이 끝나지 않았을때 getSum()을 호출하면 1~10000까지의 합이 나오리라는 보장이없다.
		//그렇기 때문에 sumThread가 끝날때까지 기다려주는 코드가 필요 그게 join()
		try {
		sumThread.join();//Main스레드는 sumThread가 끝날때까지 기다린다
		} catch(InterruptedException e) {}
		
		System.out.println("1 ~ 10000까지의 합 :"+sumThread.getSum());
	}

}
