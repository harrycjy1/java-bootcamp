package sec01_verify;

public class ChildExample {

	public static void main(String[] args) {


		Parent p = new Child();
		Child c = new Child();
		
		p.method1();
		p.method2();//�ڼ�Ŭ������ �������̵��� �޼��尡 ����
		c.method3();//�ڼ�Ŭ��������� �ٺ����̷� ���� p�δ� ȣ�� �Ұ�

	}

}
