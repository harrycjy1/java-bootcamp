package sec01_exam;

import java.util.Arrays;

public class Array_Example03 {
	

	public static void main(String[] args) {
		
		
		
		int[] iArr1=new int[10]; //���� 0���� �ʱ�ȭ��
		int[] iArr2=new int [10];
		int[] iArr3=new int[] {100, 95, 80, 70,60};
		int[] iArr4=new int[] {100, 95,80,70,60};
		
		char[] chArr=new char[] {'a','b','c','d'};
		
		
		System.out.println("�迭 iArr1�� �ʱ�ȭ ��: ");
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i]=i+1;
		}
		
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
			
		}
		
		for(int i=0; i<iArr1.length; i++) {
			if(i==9) {
				System.out.print(iArr1[i]);
			}
			else {
				System.out.print(iArr1[i]+".");
			}
			
		}
		
		System.out.println();
		//int[]Ÿ�Կ��� to.String()ȣ��� string���·� ��ȯ
		
		System.out.println(Arrays.toString(iArr2));//[�迭��,�迭��...]���·� ���
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		//print{}�޼��� �ȿ� ������ ������ ���� �⺻������ ��ü�̸�@16������ ���´�.
		//�׸��� ����������(���۷��� ����)�ڿ��� .toString()�� �����Ǿ� �ִ�.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3.toString());//�迭 �����ּ� ���[@21335 ->Ÿ��@�ּ�(16����)
		System.out.println(iArr3);//���������� �ڵ����� tostring�� ȣ���Ѵ�.
		
		System.out.println(chArr.toString());
		//char Ÿ�Ը� toString()�� ȣ���ؾ� �ּҰ� ������,
		//toString�� ȣ������ ������ �׳� ������ ��µ�
		System.out.println(chArr.toString());
		System.out.println(chArr);
		
		

	}

}

