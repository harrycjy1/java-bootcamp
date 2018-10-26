package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		
		
		WithDrawThread1 th1 = new WithDrawThread1();
		th1.setAccount(acc);
		WithDrawThread2 th2 = new WithDrawThread2();
		th2.setAccount(acc);
	
		
		th1.start();
		th2.start();
	
		
	}

}