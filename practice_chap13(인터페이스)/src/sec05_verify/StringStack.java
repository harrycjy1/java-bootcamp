package sec05_verify;

import java.util.Scanner;

public class StringStack implements Stack{

	Scanner scan = new Scanner(System.in);
	
	private String[] a;
	private int b;
	
	
	StringStack(int b){
		this.b=b;
		//a=new String[b];
	
	}
	
	@Override //���ÿ��� ���� �޼���
	public int length() {
		System.out.println(b+"���� ���ÿ����� �����Ǿ����ϴ�.");
		a=new String[b];
		return b;
	}
	
	@Override //��¸޼���
	public Object pop() {
		
		System.out.println();
		System.out.println("������ ���Լ��� �����Դϴ�.(LIFO)\r\n" + 
							"���ÿ� �ִ� ������� ����մϴ�.");
		System.out.println();
		
		
		for(int i=0; i<b; i++) {
			System.out.println((i+1)+"��° ���ÿ� ����� ������ ����մϴ�.");
			System.out.println(a[b-i-1]);
		}
		return null;
	}
	
	@Override //�Է¸޼���
	public void push(Object o) {
		
		for(int i=0; i<b; i++) {
		System.out.print("�����ϰ� ���� ������ �Է��ϼ��� : ");
		String input1 = scan.nextLine();
		a[i]=input1;
		System.out.println(input1+"�� ���ÿ� ����Ǿ����ϴ�.");
		System.out.println(input1+" ������ "+(i+1)+"��° ���ÿ� ����Ǿ����ϴ�.");
		System.out.println();
		
	}

	}
}
