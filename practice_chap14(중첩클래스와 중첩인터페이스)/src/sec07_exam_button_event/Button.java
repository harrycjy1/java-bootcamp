package sec07_exam_button_event;

public class Button {
	
	
	//�������̽� ������������
	OnClicklistner listener;
	
	//setter -- �Ű������� �������̽� Ÿ���� ����Ǿ��ִ�
	void setOnClickListener(OnClicklistner listener) {
		this.listener=listener;
	}
	
	//touch()�޼��尡 ȣ��Ǹ鼭 ��ø�������̽��� ������ ��ü�� OnClick()�޼��尡 ȣ���.
	void touch() {
		listener.OnClick();
	}
	
	//��ø�������̽�
		interface OnClicklistner {
			void OnClick();
		}
		
}
