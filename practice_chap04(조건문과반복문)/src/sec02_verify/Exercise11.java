package sec02_verify;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
		int num = (int)(Math.random()*100);
		int insert;//�Է°�
		int H=99;//�ִ�
		int L=0;//�ּ�
		int n=0;//�õ�Ƚ��
		System.out.println("���� �����Ͽ����ϴ�. ���߾����");
		
		while(true) {
			System.out.println("������ "+ L+"~"+H);
				insert = scan.nextInt();
				System.out.print(n+1+"���� �õ� >>");
				n++;
		if (insert==num) {
			System.out.println(num + " �����Դϴ�.");
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
		System.out.println("�õ�Ƚ���� "+ n +"���Դϴ�.");
		System.out.println("�ٽ� �õ� �Ͻðڽ��ϱ�? >> y/n");
		
		if(scan.next().equals("n")) {
		break;
		}
		
		
		
		}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
