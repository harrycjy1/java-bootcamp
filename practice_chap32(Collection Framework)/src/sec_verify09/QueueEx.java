package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void  save(String input) {
		q.offer(input);
		System.out.println(input);
		if(q.size()>5) {
			q.poll();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.\r\n" + 
				">>help\r\n" + 
				"help - 도움말을 보여줍니다.\r\n" + 
				"q 또는 Q - 프로그램을 종료합니다.\r\n" + 
				"history - 최근에 입력한 명령어를 5개 보여줍니다.");
		while(true) {
			System.out.print(">>");
			String input = scan.nextLine();
			
				if(input.equals("q")||input.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
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
