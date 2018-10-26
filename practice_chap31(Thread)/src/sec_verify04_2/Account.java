package sec_verify04_2;

public class Account {

	
	private int balance;
	

	public synchronized void getBalance() {
		try {
				Thread.sleep(1000);
				System.out.println("���� �ܾ� : "+ this.balance);
			} 
		catch (InterruptedException e) {}
		
		
	}

	public synchronized void setBalance(int balance) {
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"��/�� �Ա� : "+balance+"��");
			this.balance += balance;
			} 
		catch (InterruptedException e) {}
		
		
	}
	
	public synchronized void withDraw(int balance) {
		try {
			Thread.sleep(1000);
			if(balance > this.balance) {
				System.out.println(Thread.currentThread().getName()+"��/�� "+balance+"�� ��� �õ��Ͽ����ϴ�.");
				throw new InterruptedException("�ܾ��� �����մϴ�");
			}
			else {
			System.out.println(Thread.currentThread().getName()+"��/�� ��� : "+balance+"��");
			this.balance -= balance;
			}
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
