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
			System.out.println("0으로 나누는 등의 오류에요 ~~");
			System.out.println(e.toString());
		}
		finally {
			System.out.println("이 부분은 무조건 나와요");
		}
		
		
	}

}
