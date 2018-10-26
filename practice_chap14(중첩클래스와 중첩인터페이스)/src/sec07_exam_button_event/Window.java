package sec07_exam_button_event;

public class Window {
	
	//필드
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//필드의 초기값으로 익명구현객체를 생성하고 있따.
	
	Button.OnClicklistner listener = new Button.OnClicklistner() {
		
		@Override
		public void OnClick() {
			System.out.println("프로그램 설치가 진행됩니다.");
			
		}
	};

	public Window() {
		//button 클래스의 인스턴스로 setonclicklistener호출하면서 위에 생성된 매개값을 넘긴다.
		btn1.setOnClickListener(listener);
		
		//Button클래스의 인스턴스로 바로 익명구현객체를 넘긴다.
		btn2.setOnClickListener(new Button.OnClicklistner() {
			
			@Override
			public void OnClick() {
				System.out.println("게임을 시작합니다.");
				
			}
		});
		
	}
	
	
	
}
