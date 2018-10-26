package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {
		
			Number num = new Number();
			Thread th1 = new IncreaseNumberThread(num);
			th1.setName("FirstThread");
			th1.setPriority(Thread.MAX_PRIORITY);
			
			Thread th2 = new IncreaseNumberThread(num);
			th2.setName("SecondThread");
			th2.setPriority(Thread.MIN_PRIORITY);
			
			Thread th3 = new IncreaseNumberThread(num);
			th3.setName("ThirdThread");
			th3.setPriority(Thread.NORM_PRIORITY);
			
			
			th1.start();
			th2.start();
			th3.start();
			
			

	}

}
