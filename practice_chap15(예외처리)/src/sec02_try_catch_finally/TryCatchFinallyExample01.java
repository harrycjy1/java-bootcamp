package sec02_try_catch_finally;

public class TryCatchFinallyExample01 {

	public static void main(String[] args) {
		//ClassŬ������ ���ڿ��� ������ Ŭ������ ���� ��ȯ���ش�.
		//(�ν��Ͻ��� ����� �� ������, ��ȯ�� �ν��Ͻ��� ������ �˻��̴�.
		//������, ���ڿ��� �ش��ϴ� Ŭ������ ���ٸ� �Ϲ� ���ܰ� �߻��Ѵ�.
		//�׷��� �������� �����ʴ´� . �� �ٽø��� ����ó���� �ʼ����̴�.
		
		
		try {
			//Class clazz = Class.forName("java.lang.String");
			Class clazz = Class.forName("java.lang.String");
			System.out.println("Ŭ������ ã�ѽ��ϴ�.");
			System.out.println(clazz.getName());
			System.out.println(clazz.toString());
			System.out.println(clazz.getSimpleName());
			
		}
		catch(Exception e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			System.out.println(e.toString());
		}
		finally {
			//finally�� ������ �����Ѵ�.
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}
	}

}
