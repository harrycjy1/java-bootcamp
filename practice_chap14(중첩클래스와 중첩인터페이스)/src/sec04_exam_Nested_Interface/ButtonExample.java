package sec04_exam_Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		
		//setOnClickListener()�� �Ű������� �����ΰ�? �ٷ� �������̽��̴�>
		//�׷� �Ű������� ������ �Ѱܾ� �ϳ�?
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		//btn.setOnClickListener(null);
		//btn.touch();
		
		btn.setOnClickListener(cl);
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(ml);
		btn.touch();
		
	}
}
