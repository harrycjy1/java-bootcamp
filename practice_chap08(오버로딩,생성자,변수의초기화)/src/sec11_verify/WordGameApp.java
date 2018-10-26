package sec11_verify;

import java.util.Scanner;

public class WordGameApp {

		private Scanner scan;
		private String startWord = "아버지";
		private Player[] players;
		
		public WordGameApp() {
			scan = new Scanner(System.in);
			
		}
		//게임 참가자 수를 입력받고 Player[]를 생성하는 메소드
		private void createplayers() {
			
			System.out.print("게임에 참가하는 인원은 몇명입니까 >>");
			int num = scan.nextInt();
			players = new Player[num];
			
			System.out.println();
			for(int i=0; i<num; i++){
				System.out.print("참가자의 이름을 입력하세요 >>");
				String name = scan.next();
				players[i]=new Player(name);
				System.out.println();
			}
					
		}

		public void run() {
			createplayers();
			String lastWord = startWord;
			
			System.out.println("시작하는 단어는 "+lastWord+"입니다");
			int next =0; //참가자들의 순서대로 증가
		
		//게임이 끝날때까지 루프
				
			while(true) {
				String newWord = players[next].sayWord();//next참가자가 단어를 말하도록 한다.
				
				//next참가자가 성공하였는지 검사.
				if(!players[next].succeed(lastWord)) {
					System.out.println(players[next].getName()+"이 졌습니다.");
					break;
				}
				next++; //다음 참가자
				next %= players.length;//next가 참가자의 개수보다 많게 증가하는 것을 막는다.
				lastWord = newWord;
				
			}
		
		
		
		
		}
		

}
