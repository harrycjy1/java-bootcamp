package sec04_exam_Nested_Interface;

public class MessageListener implements Button.OnClicklistner{
	
	
	//중첩인터페이스의 추상메서드를 오버라이딩 한다.
	@Override
	public void OnClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
