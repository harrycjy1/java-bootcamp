package sec01_exam_CastingEx;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //up casting
		//car.water(); ���� ���������� �ڼ��� ��� �޼��带 �����Ҽ� ����. (drive,stop�޼���� ��밡��)
		fe2 = (FireEngine)car;
		fe2.water();

	}

}
