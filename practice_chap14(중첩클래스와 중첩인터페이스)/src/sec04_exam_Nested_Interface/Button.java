package sec04_exam_Nested_Interface;

public class Button {
	
	//��ø�������̽�
	interface OnClicklistner {
		void OnClick();
	}
	
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
	
}
