package sec10_verify;

public class SoundableExample {

	public static void main(String[] args) {
		
		
		Soundable sound1 = new Soundable() {
			String s = "냄비";
			
			@Override
			public void sound() {
				System.out.println("첫번째 익명구현객체 :"+s);
				System.out.println(s+"에 물을 담습니다.");
				
			}
			
		};
		sound1.sound();
		
		
		Soundable sound2 = new Soundable() {
			String s = "가스렌지";
			
			@Override
			public void sound() {
				System.out.println("두번째 익명구현객체 :"+s);
				System.out.println(s+"에 가스를 켭니다.");
			}
		};
		
		sound2.sound();

	}

}
