package sec07_verify;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean a = true;
		
		
		while(a) {
			
			System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�.");
			System.out.print("(���Ḧ ���Ͻø� -1�� �Է��� �ּ���)>>");
			double num1=scan.nextDouble();
			if(num1==-1) {
				System.out.println("���⸦ �����մϴ�.");
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
				System.out.println("�߸��� ������ �Դϴ�.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
