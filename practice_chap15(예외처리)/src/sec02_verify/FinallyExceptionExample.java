package sec02_verify;

public class FinallyExceptionExample {

	public static void main(String[] args) {

		int[] num = new int[3];
		
		try {
			for(int i=0; i<num.length; i++) {
				int z=0;
				num[i] = i+1/z;
				
			}
		}
		catch(Exception e) {
			System.out.println("0���� ������ ���� �������� ~~");
			System.out.println(e.toString());
		}
		finally {
			System.out.println("�� �κ��� ������ ���Ϳ�");
		}
		
		
	}

}
