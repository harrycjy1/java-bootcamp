package sec06_verify;

public class KumhoTire implements Tire{

	static int i;
	
	
	@Override
	public void roll() {
		System.out.println((i+1)+"��° ��ȣ Ÿ�̾ �������ϴ�.");
		i++;
		
	}

	
	
}
