package sec12_verify;

import java.util.Scanner;

public class Calculater {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		String input = scan.next();
		int operator=input.charAt(0);
		
		switch(operator) { 
		
		case'+':
			Add add = new Add();
			add.setValue(firstNum, secondNum);
			System.out.println(add.calculate());
			break;
			
		case'-':
			Sub sb = new Sub();
			sb.setValue(firstNum, secondNum);
			System.out.println(sb.calculate());
			break;
			
		case'*':
			Mul mu=new Mul();
			mu.setValue(firstNum, secondNum);
			System.out.println(mu.calculate());
			break;
			
		case'/':
			Div dv = new Div();
			dv.setValue(firstNum, secondNum);
			System.out.println(dv.calculate());
			break;
			
		}

	}
	
		
}


