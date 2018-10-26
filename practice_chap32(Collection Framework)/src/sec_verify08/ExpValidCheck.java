package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {
	
	public static Stack st = new Stack();
	public static String expression1 = "( (2*7) + 3 - 1)";
	public static String expression2 = "( (2*7) + 3 - 1";
	
	
	public static void 	ExpressionCheck	(String expression) {
		
		if(st.pop().equals(expression)) {
			System.out.println("괄호가 일치합니다.");
		}
		else
			System.out.println("괄호가 일치하지 않습니다.");
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
