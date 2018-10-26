package sec07_exam_anonymousImplements;

public class ActionExample {

	public static void main(String[] args) {
		
		Action action = new Action() {
			
			int a = 10;
			//�͸���Ŭ����, 1ȸ�� ���뵵�� ���� ����Ѵ�.
			//Ư�� UI�̺�Ʈó���� �ȵ���̵� ���α׷��ֿ��� ���� �����Ѵ�.
			
			public void method() {
				System.out.println("�͸�����ü ��ü �޼���, ������� �� : "+this.a);
			}
			
			@Override
			public void work(int a) {
				this.method();
				System.out.println(a+" ���縦 �մϴ�.");
			}
			
		};

		//action.method();
		action.work(100);
		
		//���ٽ�
		//Action action1 = (a) -> {System.out.println(a+"���縦 �մϴ�.���ٽ����� ������ ��");
	
	}

}
