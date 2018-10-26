package sec07_verify;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean a = true;
		
		
		while(a) {
			
			System.out.println("두 정수와 연산자를 입력하시오.");
			System.out.print("(종료를 원하시면 -1을 입력해 주세요)>>");
			double num1=scan.nextDouble();
			if(num1==-1) {
				System.out.println("계산기를 종료합니다.");
				break;
			}
			
			double num2=scan.nextDouble();
			String cal2 = scan.next();
			
			
			
			if(cal2.equals("+")) {
				Add add = new Add();
				add.setValue(num1, num2);
				System.out.println(num1+"+"+num2+"= "+add.calcualte());
			}
			
			else if(cal2.equals("-")) {
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				System.out.println(num1+"-"+num2+"= "+sub.calcualte());
			}
			
			else if(cal2.equals("*")) {
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				System.out.println(num1+"*"+num2+"= "+mul.calcualte());
			}
			
			else if(cal2.equals("/")) {
				Div div = new Div();
				div.setValue(num1, num2);
				System.out.println(num1+"/"+num2+"= "+div.calcualte());
			}
			else {
				System.out.println("잘못된 연산자 입니다.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
