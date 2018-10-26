package sec01_stack_queue.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//Message객체를 저장할 수 있는 즉, Queue인터페이스를 구현한 LinkedList를 생성함
		Queue<Message> me = new LinkedList<>();
		
		me.offer(new Message("sendMail", "홍길동"));
		me.offer(new Message("sendSMS","신은혁"));
		me.offer(new Message("sendKakaotalk","김기수"));
		me.offer(new Message("sendFaceBook","하리수"));
		
		while(!me.isEmpty()) {
			//Queue에 저장되어 있는 message객체를 가져온다(선입선출)
			Message message = me.poll();
			
			switch(message.getCommand()) {
			case "sendMail" :
				System.out.println(message.getTo()+"에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.getTo()+"에게 SMS를 보냅니다");
				break;
			case "sendKakaotalk" :
				System.out.println(message.getTo()+"에게 카카오톡을 보냅니다");
				break;
			case "sendFaceBook" :
				System.out.println(message.getTo()+"에게 페이스북 메세지를 보냅니다");
				break;
				
			}
		}
	}

}
