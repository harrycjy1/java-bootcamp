package sec01_verify;

import java.util.Arrays;

public class Exercise13 {

	public static void main(String[] args) {
		
		int[] arr= new int[10];
		int max=0;
		int number = 0;
		for(int i=1; i<=100; i++) {
			int num=(int)(Math.random()*10);
			System.out.printf((i%10!=0)?"%3d":"%3d\n",num);//��µǴ� ����� �׸� ���·� ����ϰ� �ϱ� ���� ���
														   //������ Ǫ�µ��� println�� ����� �� �����ص� ����� ����.
			
			arr[num]++;//���� �߿��� ī����					  	
			
		}
		
		System.out.println(Arrays.toString(arr));
		//arr[i]=n i���ڰ� n�� �����Ǿ��ٴ� ������ �ؼ�����
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				number=i;
			}//�ᱹ arr[i] �ִ밪�� ã�´ٴ°� �ִ� n�� ������ ���� ã�´ٴ� ���̰�,
		}	 //���� ū arr[i]���� ������ i�� �� n�� ������ ���� �ǹ��Ѵ�.
		
		System.out.printf("���� ���� ������ ���� : %d�� %d�� �Դϴ�.:",number,max);
		
		
		
		
		
		
		

	}

}
