package sec_verify03;

import java.util.Random;
import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		final String str[] = {"가위", "바위", "보"};
		int userChoice;
		int	computerChoice;
		

		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");
			userChoice = scan.nextInt();
			computerChoice=r.nextInt(3)+1;
			if(userChoice==4) {
				System.out.println("게임종료");
				break;
			}
			else if(computerChoice==1) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			}
			else if(computerChoice==2) {
				System.out.println("컴퓨터는 바위를 냈습니다.");	
			}
			else if(computerChoice==3){
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			
			if(userChoice==computerChoice) {
				System.out.println("비겼습니다.");
			}
			else if((userChoice==1&&computerChoice==3)||(userChoice==2&&computerChoice==1)||(userChoice==3&&computerChoice==2)){
				System.out.println("당신이 이겼습니다.");
			}
			else if((userChoice==1&&computerChoice==2)||(userChoice==2&&computerChoice==3)||(userChoice==3&&computerChoice==1)){
				System.out.println("당신이 졌습니다.");
			}
			
			
		}
	
	
	
	
	
	
	
	}

}
