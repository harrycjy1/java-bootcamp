package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {
	
	public static Stack st = new Stack();
	public static String expression1 = "( (2*7) + 3 - 1)";
	public static String expression2 = "( (2*7) + 3 - 1";
	
	
	public static void 	ExpressionCheck	(String expression) {
		
		if(st.pop().equals(expression)) {
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		}
		else
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		st.push(expression1);
		System.out.println("expression1 :" + st.peek());
		ExpressionCheck(expression1);
		
		st.push(expression2);
		System.out.println("expression2 : "+st.peek());
		ExpressionCheck(expression1);
	}

}
