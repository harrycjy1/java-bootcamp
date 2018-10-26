package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.
	
	public static void  save(String input) {
		q.offer(input);
		System.out.println(input);
		if(q.size()>5) {
			q.poll();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.\r\n" + 
				">>help\r\n" + 
				"help - ������ �����ݴϴ�.\r\n" + 
				"q �Ǵ� Q - ���α׷��� �����մϴ�.\r\n" + 
				"history - �ֱٿ� �Է��� ��ɾ 5�� �����ݴϴ�.");
		while(true) {
			System.out.print(">>");
			String input = scan.nextLine();
			
				if(input.equals("q")||input.equals("Q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				}
			
				else if(input.equals("history")) {
					for(String str : q) 
					System.out.println(str);	
				}
				else
				save(input);

		}
	
	}

}
