package sec03_exam_threadExtends_01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//����� ���� ����Ŭ�����ι��� �����ϴ� ��Ƽ ������ ���
		//����� ������ ������ ����
		Thread thread = new BeepThread();
		thread.start();
		
		//"��"���ڿ� ���
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
