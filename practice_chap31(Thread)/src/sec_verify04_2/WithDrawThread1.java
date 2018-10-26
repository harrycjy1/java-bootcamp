package sec_verify04_2;

public class WithDrawThread1 extends Thread{
	
	private Account account;
	
	
	public synchronized void setAccount(Account account) {
		this.account=account;
		this.setName("¾î¸Ó´Ï");
		
	}
	
	@Override
	public void run() {
		synchronized (account) {
			
		
		account.setBalance(1000);
		account.withDraw(500);
		account.getBalance();
		}
		try {
			Thread.sleep(3000);
			account.withDraw(300);
		} catch (InterruptedException e) {}
		
		
		
		
	}

	

}