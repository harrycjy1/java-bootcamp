package sec01_verify;

import java.util.Scanner;

public class Person {
	
	Scanner scan =new Scanner(System.in);
	private String 	P_name;
	
	
	
	Person(String name){
		System.out.print("�̸��� �Է��ϼ���.");	
		this.P_name=scan.next();
	}
	
	@Override
	public String toString() {
		
		return "�̸� : "+this.P_name;
	}
	
	
}
