package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		
		//String data = null;
		String data = new String("�ڹ�");
		//NullPointerException �߻�(��Ÿ�� ����)�� �� ������?
		System.out.println(data.toString());

	}

}
