package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {
		
		System.out.println("�١١ٳ��� �켱������ ��������Ʈ�١١�");
		
		System.out.println("���� �̸�\t�ҿ�ð�(��)\t�켱����");
		
		Task t1 = new Task("���� ����",30);
		t1.setPriority(3);
		Task t2	= new Task("���� ����",80);
		t1.setPriority(1);
		Task t3 = new Task("�ڹ� ����",150);
		t1.setPriority(2);
		
		System.out.println(t1.taskName+"\t"+t1.time+"��\t\t"+t1.priority_number);
		System.out.println(t2.taskName+"\t"+t2.time+"��\t\t"+t2.priority_number);
		System.out.println(t3.taskName+"\t"+t3.time+"��\t\t"+t3.priority_number);

	}

}
