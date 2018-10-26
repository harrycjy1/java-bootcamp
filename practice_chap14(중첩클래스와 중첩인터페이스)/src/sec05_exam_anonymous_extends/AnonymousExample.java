package sec05_exam_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		//�͸� �ڽİ�ü���� �����ǵ� wake�� ȣ��ȴ�.
		anony.field.wake();
		//�޼��� ȣ��� ���ÿ� ���ú����� �͸��ڽİ�ü �����Ǿ� �����ȴ�.
		anony.method();
		
		anony.method(new Person() {
		
			//�Ű������� �͸��ڽİ�ü�� �����ؼ� ȣ���ϰ� �ִ�.
			void study() {
				System.out.println("�����մϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("13�ÿ� �Ͼ�ϴ�.");
				this.study();
			}
			
		});
		
		
	
		
	}
}
