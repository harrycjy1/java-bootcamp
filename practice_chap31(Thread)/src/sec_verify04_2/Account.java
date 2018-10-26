package sec_verify04_2;

public class Account {

	
	private int balance;
	

	public synchronized void getBalance() {
		try {
				Thread.sleep(1000);
				System.out.println("통장 잔액 : "+ this.balance);
			} 
		catch (InterruptedException e) {}
		
		
	}

	public synchronized void setBalance(int balance) {
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"이/가 입금 : "+balance+"원");
			this.balance += balance;
			} 
		catch (InterruptedException e) {}
		
		
	}
	
	public synchronized void withDraw(int balance) {
		try {
			Thread.sleep(1000);
			if(balance > this.balance) {
				System.out.println(Thread.currentThread().getName()+"이/가 "+balance+"원 출금 시도하였습니다.");
				throw new InterruptedException("잔액이 부족합니다");
			}
			else {
			System.out.println(Thread.currentThread().getName()+"이/가 출금 : "+balance+"원");
			this.balance -= balance;
			}
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
