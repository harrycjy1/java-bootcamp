package sec02_verify;

import java.util.Scanner;

public class Exercise08_1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
	    int num = scan.nextInt();
		
	    System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
        int num2 = scan.nextInt();
        
        System.out.println("1�� 15���� 3�� 4�� ����� ������ ��� :" );
        for (int i=num; i<=num2; i++) {
        	        
        if (i%3==0||i%4==0) 
        	
        continue;
        	
        System.out.println(i);
            
        	
        }
        
                
        
   
        
        
	}

}
