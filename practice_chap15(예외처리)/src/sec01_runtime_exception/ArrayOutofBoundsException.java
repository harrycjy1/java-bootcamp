package sec01_runtime_exception;

public class ArrayOutofBoundsException {

	public static void main(String[] args) {
		
		if(args.length ==2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("arg[0]"+data1);
			System.out.println("arg[1]"+data2);
		}
		
		else {
			//���� �Ű����� ������ arrayoutofboudsexception �߻�
			
			System.out.println("������");
			System.out.println("Java ArrayOutOfBoundsException");
			System.out.println("��1 ��2");
		}

	}

}
