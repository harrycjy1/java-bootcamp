package sec10_verify;

public class SoundableExample {

	public static void main(String[] args) {
		
		
		Soundable sound1 = new Soundable() {
			String s = "����";
			
			@Override
			public void sound() {
				System.out.println("ù��° �͸�����ü :"+s);
				System.out.println(s+"�� ���� ����ϴ�.");
				
			}
			
		};
		sound1.sound();
		
		
		Soundable sound2 = new Soundable() {
			String s = "��������";
			
			@Override
			public void sound() {
				System.out.println("�ι�° �͸�����ü :"+s);
				System.out.println(s+"�� ������ �մϴ�.");
			}
		};
		
		sound2.sound();

	}

}
