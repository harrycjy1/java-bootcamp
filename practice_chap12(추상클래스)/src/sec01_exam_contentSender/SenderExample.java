package sec01_exam_contentSender;

public class SenderExample {

	public static void main(String[] args) {
	//�߻�Ŭ������ �ν��Ͻ��� ����� �������� ���Ѵ�.
	//ContentSender cs = new ContentSender(); //���ܹ߻� ����?
		
		//�߻� Ŭ������ �����̱⶧���� �������� ����ɼ� �ִ�.
		//��, ����Ŭ���� ����� �߻�޼��带 �� ������ �ڼ�Ŭ������ ������ �����ϴ�.
		
		ContentSender cs = new letterSender("SMS����", "�����", "4�޶�");
		cs.sendMsg("������");
		System.out.println();
		
		letterSender ls = new letterSender("SMS����", "�������", "�氡�� ������");
		kakaoSender ks = new kakaoSender("īī����","������","�氡�� īī�����̾�");
		
		//����Ŭ������ �߻�޼��带 �������̵��� �޼��� ȣ�� ���� �ٸ������ ������
		
		ls.sendMsg("�׳�1");
		System.out.println();
		ks.sendMsg("������");

	}

}
