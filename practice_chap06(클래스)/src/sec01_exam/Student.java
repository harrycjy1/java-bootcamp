package sec01_exam;

//�Ӽ� 2���� ����� �ϳ��� ���� Ŭ������ �������
//�ϳ��� JAVA���Ͽ��� ���������� public ������ �Ѱ����߸� �Ѵ�.
//����������
/*
	1. private : ���� Ŭ������������ ���ٰ���
	2. protected : ���� ��Ű��, �ٸ���Ű�� �ڼ�Ŭ���������� ���ٰ���
	3. default : ���� ��Ű��, �ٸ� ��Ű�� ���ٰ���
	4. public : � Ŭ������ �� ���� ����

*/

public class Student {
	//�������(�ʵ�)
	String name = "������";
	int age = 29;
	
	//ObjectŬ�������� StudentŬ������ toStirng()
	@Override
	public String toString() {
		
		return "�̸� : "+this.name+", ���� : "+this.age;
	} //this = ��ü �ڱ��ڽ��� �ּҰ��� ������ ����

}
