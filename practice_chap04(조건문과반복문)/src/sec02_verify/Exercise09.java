package sec02_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		

		int total =0;
		String input;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("상품금액을 입력하세요 : ");
			input= scan.nextLine();
			
			if(input.equals("끝")) {
				System.out.println("구매하신 상품들의 총가격은 "+total+"입니다.");
				break;		
			}
			
			
			else {
				total += Integer.parseInt(input);
				
			}	
			
				
		}
				
		
	}

}
