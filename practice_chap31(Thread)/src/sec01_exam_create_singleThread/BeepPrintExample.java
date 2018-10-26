package sec01_exam_create_singleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	//main()������� JVM�� �������� �������
	public static void main(String[] args) {
		/*
		 * �Ʒ��ڵ�� �̱۽����忡�� ���ư��� �۾��̹Ƿ�, �������� 5�� �˸��� ����, "��"�̶�� ���ڿ��� 5�� ����Ѵ�
		 * ������ �츮�� ���ϴ°��� ���̶�� ���ڿ��� ��µǸ鼭 �������� ���� ��µǴ� ���� ���Ѵ�.
		 * �̰��� �̱� �������� ����, �� �������̶�� ���̴�
		 * �̰��� ��Ƽ������� �ٲ㰡�°��� ������ �忡�� �츮�� �ؾ��� ���̴�.
		 * �������� 5�� �ں��ؼ� �Ҹ�������
		 * Toolkit�� AWT(Abstract Window Toolkit)�߻�Ŭ������ ��ӹ��� �� �ٸ� �߻�Ŭ�����̴�.
		 * ������ GUI���õ� �޼������ �ִ� getDefaultToolkit �� �⺻���� �޼��带 �����س��� �޼����̴�.
		 * 
		 * */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
