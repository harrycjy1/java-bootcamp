package sec01_stack_queue.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//Message��ü�� ������ �� �ִ� ��, Queue�������̽��� ������ LinkedList�� ������
		Queue<Message> me = new LinkedList<>();
		
		me.offer(new Message("sendMail", "ȫ�浿"));
		me.offer(new Message("sendSMS","������"));
		me.offer(new Message("sendKakaotalk","����"));
		me.offer(new Message("sendFaceBook","�ϸ���"));
		
		while(!me.isEmpty()) {
			//Queue�� ����Ǿ� �ִ� message��ü�� �����´�(���Լ���)
			Message message = me.poll();
			
			switch(message.getCommand()) {
			case "sendMail" :
				System.out.println(message.getTo()+"���� ������ �����ϴ�.");
				break;
			case "sendSMS" :
				System.out.println(message.getTo()+"���� SMS�� �����ϴ�");
				break;
			case "sendKakaotalk" :
				System.out.println(message.getTo()+"���� īī������ �����ϴ�");
				break;
			case "sendFaceBook" :
				System.out.println(message.getTo()+"���� ���̽��� �޼����� �����ϴ�");
				break;
				
			}
		}
	}

}
