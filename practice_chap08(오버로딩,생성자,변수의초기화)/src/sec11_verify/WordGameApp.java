package sec11_verify;

import java.util.Scanner;

public class WordGameApp {

		private Scanner scan;
		private String startWord = "�ƹ���";
		private Player[] players;
		
		public WordGameApp() {
			scan = new Scanner(System.in);
			
		}
		//���� ������ ���� �Է¹ް� Player[]�� �����ϴ� �޼ҵ�
		private void createplayers() {
			
			System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >>");
			int num = scan.nextInt();
			players = new Player[num];
			
			System.out.println();
			for(int i=0; i<num; i++){
				System.out.print("�������� �̸��� �Է��ϼ��� >>");
				String name = scan.next();
				players[i]=new Player(name);
				System.out.println();
			}
					
		}

		public void run() {
			createplayers();
			String lastWord = startWord;
			
			System.out.println("�����ϴ� �ܾ�� "+lastWord+"�Դϴ�");
			int next =0; //�����ڵ��� ������� ����
		
		//������ ���������� ����
				
			while(true) {
				String newWord = players[next].sayWord();//next�����ڰ� �ܾ ���ϵ��� �Ѵ�.
				
				//next�����ڰ� �����Ͽ����� �˻�.
				if(!players[next].succeed(lastWord)) {
					System.out.println(players[next].getName()+"�� �����ϴ�.");
					break;
				}
				next++; //���� ������
				next %= players.length;//next�� �������� �������� ���� �����ϴ� ���� ���´�.
				lastWord = newWord;
				
			}
		
		
		
		
		}
		

}
