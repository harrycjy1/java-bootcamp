package sec04_exam_generic_method_1;

public class BoxingMethodExample {

	public static void main(String[] args) {
		
			//UtilŬ������ boxing()�޼���� �����޼����̸鼭, ���׸� �޼����̴�.
			//�Ͽ� �Ʒ��� ���� Ÿ���� ��������� �Ѵ�. �׷� ������ Ÿ�Կ� ���ؼ� T�� �����Ǿ�����.
			//��ü�� Ÿ���� Integer�̴�. �׷��Ƿ� Intefer��ü�� ���;��Ѵ�.
			//�ƿ﷯ ����Ÿ���� Box<Integer>�� �Ǿ���Ѵ�.
		
			Box<Integer> box = Util.<Integer>boxing(100);
			
			//���� integer��ü�� �����ؼ� �Ű������� �൵ �ȴ�.
			Box<Integer> box1 = Util.<Integer>boxing(new Integer(100));
			
			//<Integer>�� ��� �ȴ�. �����Ϸ��� �˾Ƽ� �Ű������� ���� Ÿ���� �����Ѵ�.
			//�̹���� ��κ� ���
			Box<Integer> box2 = Util.boxing(100);
			
			int intValue = box2.get();
			System.out.println("Box<integer> box2 ��ü���� ���� �� : "+intValue);
			
			Box<String> box3 = Util.boxing("ȫ�浿");
			String strValue = box3.get();
			System.out.println("Box<String> box3 ��ü���� ���� �� : "+strValue);

	}

}
