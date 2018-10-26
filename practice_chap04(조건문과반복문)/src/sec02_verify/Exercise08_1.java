package sec02_verify;

import java.util.Scanner;

public class Exercise08_1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("첫번째 수를 입력하시오 : ");
	    int num = scan.nextInt();
		
	    System.out.print("두번째 수를 입력하시오 : ");
        int num2 = scan.nextInt();
        
        System.out.println("1과 15에서 3과 4의 배수를 제외한 결과 :" );
        for (int i=num; i<=num2; i++) {
        	        
        if (i%3==0||i%4==0) 
        	
        continue;
        	
        System.out.println(i);
            
        	
        }
        
                
        
   
        
        
	}

}
