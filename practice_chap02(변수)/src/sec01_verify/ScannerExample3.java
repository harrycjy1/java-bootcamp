package sec01_verify;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("num1 �Է� : ");
	double num1 = scanner.nextDouble();
	System.out.println("num2�Է� : ");
	double num2 = scanner.nextDouble();
	
	double result = num1 + num2;
	System.out.println("result(���ϱ�) : " + result);
	double result2 = num1 - num2;
	System.out.println("result(����) : " + result2);
    
	double result3 = num1 / num2;
    //DecimalFormat from=new DecimalFormat("#.#");
    System.out.println("result(������):" + Math.round(result3*10)/10);
    
    double result4 = num1 * num2;
	System.out.println("result(���ϱ�) : " + Math.round(result4*10)/10);
	
    
    

	
	
	
	
	
	}

}
