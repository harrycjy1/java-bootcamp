package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {
	Car car = new Car();
	//Car car=null;
	
	//����Ÿ���� ���������� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ� �� �մ�.
	//(�������� ����� ��->� �δ� ����), �ݴ� �Ұ���
	//Car car = new FireEngine(); //�̷������� ������
	
	//Car2�� null�ʱ�ȭ
	Car car2 =null;
	FireEngine fe = new FireEngine(); //fe�� null�ʱ�ȭ
	//Car�� drive()�޼��� ȣ��
	
	car.drive();
	//�ڼ�Ÿ���� �ν��Ͻ��� ������ ����Ÿ���� �ν��Ͻ� �ٷ�� ����.
	car=fe; //��ĳ����
	fe=(FireEngine) car; //ĳ���ÿ����� �� ���°��ΰ�???(��������� downĳ������ upĳ���õȰ��� ������ ����ϴ°�)
	fe.drive();
	car2 = fe;
	car2.drive();
	fe.water();
	
	
	
	}
}