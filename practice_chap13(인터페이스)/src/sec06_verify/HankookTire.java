package sec06_verify;

public class HankookTire implements Tire{

	static int i;
	
	
	@Override
	public void roll() {
		System.out.println((i+1)+"��° �ѱ� Ÿ�̾ �������ϴ�.");
		i++;
	}

	
	
}
