package sec03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception{
		
		//���� ���� �Ű����� ���� ����Ǵ� �޼��尡 �޶����� �ָ�����
		
		//Class clazz = Class.forName("java.lang.String");
		
		//SendAction ��ü ����
		//Class clazz = Class.forName("sec03_newinstance.SendAction");
		
		/*String str = (String)clazz.newInstance();
		str = "��Ʈ�� Ÿ��";
		System.out.println(str);*/
		
		//receiveAction ��ü ����
		
		Class clazz = Class.forName("sec03_newinstance.ReceiveAction");
		
		//Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
		
		//�������̽�Ÿ������ ���� ����ȯ(������)
		Action action = (Action) clazz.newInstance(); //newInstance�� objŸ������ ���ϰ��� �ѱ�
		//Object obj = clazz.newInstance();
		//Action action1 = (Action) obj;
		
		action.execute();

	}

}
