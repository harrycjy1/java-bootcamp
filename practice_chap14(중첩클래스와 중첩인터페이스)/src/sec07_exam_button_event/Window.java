package sec07_exam_button_event;

public class Window {
	
	//�ʵ�
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//�ʵ��� �ʱⰪ���� �͸�����ü�� �����ϰ� �ֵ�.
	
	Button.OnClicklistner listener = new Button.OnClicklistner() {
		
		@Override
		public void OnClick() {
			System.out.println("���α׷� ��ġ�� ����˴ϴ�.");
			
		}
	};

	public Window() {
		//button Ŭ������ �ν��Ͻ��� setonclicklistenerȣ���ϸ鼭 ���� ������ �Ű����� �ѱ��.
		btn1.setOnClickListener(listener);
		
		//ButtonŬ������ �ν��Ͻ��� �ٷ� �͸�����ü�� �ѱ��.
		btn2.setOnClickListener(new Button.OnClicklistner() {
			
			@Override
			public void OnClick() {
				System.out.println("������ �����մϴ�.");
				
			}
		});
		
	}
	
	
	
}
