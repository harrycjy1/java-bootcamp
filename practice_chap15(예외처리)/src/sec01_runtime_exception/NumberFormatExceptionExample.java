package sec01_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value = Integer.parseInt(data1);
		System.out.println(value);
		
		//int value2 = Integer.parseInt(data2);
		//integer.parseint �޼���� ���ڿ��� ���ڷ� ���ٲ�

	}

}
