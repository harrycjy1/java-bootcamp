package sec01_verify;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��Ҽ��Է� :");
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			int r =(int)(Math.random()*10)+1;//���� ���� �ٸ��ڵ嵵 �˾ƺ���
			
				arr[i]=r;//�迭 arr[]�� r���� ���� for�� �ȿ��� ��� �ݺ������Ѵ�!
			System.out.println("arr["+i+"] : "+arr[i]);
			
		}
			
	}

}
