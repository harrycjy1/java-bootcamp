package sec06_verify;

public class CellPhone {

		String model;
		String color;
		int count=0;//������ �޼����� 2��
		
		void powerOn() {
			System.out.println("������ �մϴ�.");
		}
		void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
		void bell() {
			System.out.println("���� �︳�ϴ�.");
		}
		void sendVoice() {
			if(count==0) {
				System.out.println("�ڱ�: ��������");
				count++;
			}
			else if(count==1) {
				System.out.println("�ڱ� : ��~ �� �ݰ����ϴ�.");
			}
		}
		void receiveVoice() {
			System.out.println("����: �ȳ��ϼ���! ���� ȫ�浿�ε���");
		}
		void hangUp() {
			System.out.println("��ȭ�� �����ϴ�.");
		}
		
	
	
	
	
}
