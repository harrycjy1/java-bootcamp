package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable{

	
	
	@Override
	public void run() {
		System.out.println("[������ �۾� ��û]");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ������ ���� �Է��ϼ��� : ");
		int input = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(input+ "*" +i +"="+i*input);
		}
		
	}

}
