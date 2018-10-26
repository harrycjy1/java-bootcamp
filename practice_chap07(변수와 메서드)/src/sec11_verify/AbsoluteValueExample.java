package sec11_verify;

import java.util.Scanner;

public class AbsoluteValueExample {

	public static void main(String[] args) {
		
		AbsoluteValue ab =new AbsoluteValue();
		
		Scanner scan = new Scanner(System.in);
				
		int input1 = scan.nextInt();
		ab.abs(input1);
		int input2 = scan.nextInt();
		ab.abs(input2);

	}

}
