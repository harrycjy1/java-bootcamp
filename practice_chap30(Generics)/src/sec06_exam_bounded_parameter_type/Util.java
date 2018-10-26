package sec06_exam_bounded_parameter_type;

public class Util {

			//�Ű������� TŸ���� <T extends Number> �� �����Ѱ���,
			//NumberŬ���� �̰ų� ����Ŭ������ ����ǵ��� ������ ��.
	public static <T extends Number> int compare(T t1, T t2) {
		//NumberŬ������ doubleValue()�� �߻�޼��带 �̿���
		//����������� NumberŬ������ ��ӹ޴� Ŭ������,
		//doubleValue()�߻�޼��带 �������� Ŭ������ �����ϴٰ� ���� �ȴ�.
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		return Double.compare(value1, value2);
		
		
	}
}
