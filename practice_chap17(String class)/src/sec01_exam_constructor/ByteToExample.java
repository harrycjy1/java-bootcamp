package sec01_exam_constructor;

public class ByteToExample {

	public static void main(String[] args) {
			
		//10���� Ű�ڵ�(�����ڵ�)���� ����Ǿ� �ִ� byte�迭
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		//���� �ִ� byte�迭�� str�� ���ڵ�
		String str = new String(bytes);
		System.out.println(str);

	}

}
