package sec01_verify;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하시오");
		
		int month = scan.nextInt();
		
		//if문
		if (month>=1 && month<=3) {
			System.out.println(month+"월은 spring입니다.");
		}
		else if(month>=4 && month<=6) {
			System.out.println(month+"월은 summer입니다.");
		}
		else if(month>=7 && month <=9) {
			System.out.println(month+"월은 fall입니다.");
		}
		else {
			System.out.println(month+"월은 winter입니다.");
		}
	
        
		//switch문
		
		
		
			
		
	
	
	
	
	
	
	
	
	
	
	

	
	}

}
