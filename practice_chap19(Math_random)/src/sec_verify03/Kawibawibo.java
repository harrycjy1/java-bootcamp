package sec_verify03;

import java.util.Random;
import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		final String str[] = {"����", "����", "��"};
		int userChoice;
		int	computerChoice;
		

		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���>>");
			userChoice = scan.nextInt();
			computerChoice=r.nextInt(3)+1;
			if(userChoice==4) {
				System.out.println("��������");
				break;
			}
			else if(computerChoice==1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
			}
			else if(computerChoice==2) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");	
			}
			else if(computerChoice==3){
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			}
			
			if(userChoice==computerChoice) {
				System.out.println("�����ϴ�.");
			}
			else if((userChoice==1&&computerChoice==3)||(userChoice==2&&computerChoice==1)||(userChoice==3&&computerChoice==2)){
				System.out.println("����� �̰���ϴ�.");
			}
			else if((userChoice==1&&computerChoice==2)||(userChoice==2&&computerChoice==3)||(userChoice==3&&computerChoice==1)){
				System.out.println("����� �����ϴ�.");
			}
			
			
		}
	
	
	
	
	
	
	
	}

}
