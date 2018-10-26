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
	
	@Override //스택영역 생성 메서드
	public int length() {
		System.out.println(b+"개의 스택영역이 생성되었습니다.");
		a=new String[b];
		return b;
	}
	
	@Override //출력메서드
	public Object pop() {
		
		System.out.println();
		System.out.println("스택은 후입선출 개념입니다.(LIFO)\r\n" + 
							"스택에 있는 문장들을 출력합니다.");
		System.out.println();
		
		
		for(int i=0; i<b; i++) {
			System.out.println((i+1)+"번째 스택에 저장된 문장을 출력합니다.");
			System.out.println(a[b-i-1]);
		}
		return null;
	}
	
	@Override //입력메서드
	public void push(Object o) {
		
		for(int i=0; i<b; i++) {
		System.out.print("저장하고 싶은 문장을 입력하세요 : ");
		String input1 = scan.nextLine();
		a[i]=input1;
		System.out.println(input1+"가 스택에 저장되었습니다.");
		System.out.println(input1+" 문장이 "+(i+1)+"번째 스택에 저장되었습니다.");
		System.out.println();
		
	}

	}
}
