package sec02_verify;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
		int num = (int)(Math.random()*100);
		int insert;//입력값
		int H=99;//최대
		int L=0;//최소
		int n=0;//시도횟수
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		
		while(true) {
			System.out.println("범위는 "+ L+"~"+H);
				insert = scan.nextInt();
				System.out.print(n+1+"번쨰 시도 >>");
				n++;
		if (insert==num) {
			System.out.println(num + " 정답입니다.");
			break;
		}
		else if(insert>num){
			System.out.println("down");
			H = insert;
			
		}
		else  { System.out.println("up");
		L = insert;	
		}
		
	
	} 
		System.out.println("시도횟수는 "+ n +"번입니다.");
		System.out.println("다시 시도 하시겠습니까? >> y/n");
		
		if(scan.next().equals("n")) {
		break;
		}
		
		
		
		}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
