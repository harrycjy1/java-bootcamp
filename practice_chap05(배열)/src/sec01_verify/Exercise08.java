package sec01_verify;

import java.util.Arrays;
import java.util.Random;

public class Exercise08 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("��µǴ� ���� code�迭�� �ִ� �����θ� ������");
		System.out.println("�迭�� ���");
		
		int[] code = new int[] {-9,-55,73,116,101,205,1000};
		int[] arr= new int[10]; //���� ����
		
		
		for(int i=0; i<arr.length; i++) {
			int r=ran.nextInt(7); //code�� �迭���̰� 7���� �̹Ƿ� 7������ ������ �߻���Ų��.
			arr[i]=code[r]; //�������� ���ԵǴ� code�迭���� arr�迭���� ���ʷ� �ھƳִ´�.
		}
			
		System.out.println(Arrays.toString(arr));
		//tostring �޼����� [�迭��,�迭��...]���� ���	
		
				
			
		
		
		
		
		
		
		
		
		
	}

}
