package sec02_exam_generic_type.copy;

public class TvExample {

	public static void main(String[] args) {
				//��ü�� Ÿ������ String�� ����	
				Tv<String> tv1 = new Tv<String>();
				//Tv<String> tv1 = new Tv();
				//�̷��� �����ص� ���������� �̰� �����׸��ڵ��� Object�� ���°� �ȴ�.
				//TV tv = new Tv();
				//tv1.setT(new Integer(42)); //���� ������?
				tv1.setT("LG OLED TV");
				String str = tv1.getT();
				System.out.println("���� TV�� "+ str);
				
				//Ÿ���� Integer�� ����
				
				Tv<Integer> tv2 = new Tv<Integer>();
				tv2.setT(42);
				Integer inch =tv2.getT();
				System.out.println("TV�� ũ��� "+inch+"inch");
	}

}
