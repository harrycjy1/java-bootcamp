package sec04_verify;

public class SmartPhone extends PDA implements MobilePhone,MP3{
	
	@Override
	public void play() {
		System.out.println("MP3�� ������ Ƶ�ϴ�.");
		
	}
	@Override
	public void stop() {
		System.out.println("MP3�� ������ �����մϴ�.");
		
	}
	@Override
	public void Sendcall() {
		System.out.println("��ȭ�� �ɾ� ���ϴ�.");
		
	}
	@Override
	public void receivecall() {
		System.out.println("��ȭ�� �޽��ϴ�.");
		
	}
	@Override
	public void SendSMS() {
		System.out.println("���ڸ� �����ϴ�.");
		
	}
	@Override
	public void receiveSMS() {
		System.out.println("���ڸ� �޽��ϴ�.");
	}
	
	public void scheduler() {
		System.out.println("���� ������ �����մϴ�.");
	}
	
	public void applicationManager() {
		System.out.println("�ش� ���� ��ġ �� ������ �����մϴ�.");
	}

}
