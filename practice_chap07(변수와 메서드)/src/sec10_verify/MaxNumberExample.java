package sec10_verify;

import java.util.Arrays;

public class MaxNumberExample {

	public static void main(String[] args) {
		
		int[] a=new int[] {23,72,9,54,1747};
		
		System.out.println("���� �迭 �����Դϴ�.\n"+Arrays.toString(a));
		
		MaxNumber max = new MaxNumber();
		
		max.max(a);
		
		//0�� ũ���� �迭�� ������
		int[] b=new int[0];
		
		System.out.println("ũ�Ⱑ 0�� �迭�� �ּҸ� ���� ��");
		max.max(b);
		
		//null���� ������
		int[] c=null;
		System.out.println("null���� ������");
		max.max(null);
		

	}

}
