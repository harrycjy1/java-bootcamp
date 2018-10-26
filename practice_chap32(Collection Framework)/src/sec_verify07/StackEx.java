package sec_verify07;

import java.util.Stack;

public class StackEx {
	public static Stack<String> back    = new Stack<>();
	public static Stack<String> forward = new Stack<>();
	
	public static void printStatus() {
		System.out.println("back : "+back);
		System.out.println("foward : "+forward);
		System.out.println("���� ȭ���� '"+back.peek()+"' �Դϴ�.");
		
	}
	
	public static void 	goURL(String url)	{
		System.out.println("= ���ο� �ּҷ� �̵� �� =");
		forward.clear();
		back.push(url);
		printStatus();
		
	}
	
	public static void 	goForward() {
		System.out.println("= '������' ��ư�� ���� �� =");
		String str = forward.pop();
		back.push(str);
		printStatus();
		
	}
	
	public static void 	goBack() {
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");
		String str = back.pop();
		forward.push(str);
		printStatus();
	}

	public static void main(String[] args) {
		
		back.push("1.����Ʈ");
		back.push("2.����");
		back.push("3.���̹�");
		back.push("4.����");
		
		printStatus();
		System.out.println();
		goBack();
		System.out.println();
		goBack();
		System.out.println();
		goForward();
		System.out.println();
		goURL("dgit.com");
		

	}

}
