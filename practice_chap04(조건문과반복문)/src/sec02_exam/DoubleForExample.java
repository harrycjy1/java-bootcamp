package sec02_exam;

public class DoubleForExample {

	public static void main(String[] args) {
	
		
		for (int m=2;m<=9; m++) {
			System.out.println("***"+m+"��***");
			
			for(int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}

		/*
		   1)m=2>> ***2��***
			n=1 >> 2x1=2>> n++>> n=2
			n=2 >> 2x2=4>> n++>> n=3
			n=3 >> 2x3=6>> n++>> n=4
			.
			.
			.
			n=9 >> 2x9=18>> n++>> n=10
			n=10>> n�� 9�� �Ѿ���� >> m++���� >>m=3
		   2)m=3 >>***3��***��� ��
			n=1(�� m�� ���������Ŀ� n�� ���ʼ����� 1�� �ٽ� �ʱ�ȭ��)
			>> 3x1=3 >> n++>> n=2
			>> ���� �۾��� �ݺ�
		*/
		
		
		
		
	}

}
