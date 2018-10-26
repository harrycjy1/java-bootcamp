package sec01_verify;

import java.util.Scanner;

public class Student extends Person {
	
	private String 	S_num;
	Scanner scan = new Scanner(System.in);
	
	
	Student(String name, String num){
	super("");
	System.out.print("학번을 입력하세요 : ");
	this.S_num=scan.next();
	}
		
	
	@Override
	public String toString() {
		
		System.out.println(super.toString());
		return "학번 : "+this.S_num;
		
	}
}
