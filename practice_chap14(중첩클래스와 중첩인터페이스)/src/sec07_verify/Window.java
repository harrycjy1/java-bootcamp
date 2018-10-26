package sec07_verify;

public class Window {

	Button 		btn1=new Button();
	Button 		btn2=new Button();
	
	
	
	Button.OnClicklistner listener= new Button.OnClicklistner() {
		
		@Override
		public void OnClick() {
			System.out.println("Button1 누름 : 전화를 겁니다.");
		}
	};
	
	
	
	
	Window (){
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClicklistner() {
			
			@Override
			public void OnClick() {
				System.out.println("Button2 누름 : 메시지를 보냅니다.");
				
			}
		});
	
	}
	
	
}
