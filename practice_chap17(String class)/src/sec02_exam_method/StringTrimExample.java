package sec02_exam_method;

public class StringTrimExample {

	public static void main(String[] args) {
		
			//trim()�� ���ڿ��� �������� �¿��� ���鸸 ���ش�. 
			//�Ͽ� ���ڿ� �߰��� �ִ� ������ ���� ã�Ƽ� �����ִ� �ڵ� ��������
		
		String tel1 = "    02";
		String tel2 = "123   ";
		String tel3 = "   12 34    ";
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
	}

}
