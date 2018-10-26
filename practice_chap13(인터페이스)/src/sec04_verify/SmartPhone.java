package sec04_verify;

public class SmartPhone extends PDA implements MobilePhone,MP3{
	
	@Override
	public void play() {
		System.out.println("MP3로 음악을 틉니다.");
		
	}
	@Override
	public void stop() {
		System.out.println("MP3로 음악을 중지합니다.");
		
	}
	@Override
	public void Sendcall() {
		System.out.println("전화를 걸어 봅니다.");
		
	}
	@Override
	public void receivecall() {
		System.out.println("전화를 받습니다.");
		
	}
	@Override
	public void SendSMS() {
		System.out.println("문자를 보냅니다.");
		
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자를 받습니다.");
	}
	
	public void scheduler() {
		System.out.println("일정 관리를 시작합니다.");
	}
	
	public void applicationManager() {
		System.out.println("해당 앱을 설치 및 삭제를 시작합니다.");
	}

}
