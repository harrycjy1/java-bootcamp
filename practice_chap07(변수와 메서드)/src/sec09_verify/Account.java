package sec09_verify;

public class Account {

	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	int	balance;
	
	public void setBalance(int balance) {
		if(balance>MAX_BALANCE||balance<MIN_BALANCE) {
			System.out.println("�Ա��Ͻ� �ݾ��� -�̰ų� �鸸���� �ʰ�����!");
		}
		else{
			this.balance += balance;
		}
		System.out.println("���� �ܰ� : "+this.balance);
	}

	public int getBalance() {
		return balance;
	}

	
	}
	
	
	

	
	

