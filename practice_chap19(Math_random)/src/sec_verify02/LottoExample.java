package sec_verify02;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		System.out.println("�ζ� ��ȣ ������ ���α׷��Դϴ�.\r\n" + 
				"�ڵ����� ��ȣ�� �����մϴ�.");
		
		Random r=new Random();
		Random fix = new Random(1);
		int[] rarr=new int[6];
		int[] fixarr=new int[6];
		
		for(int i=0; i<6; i++) {
			rarr[i]=r.nextInt(46);
			fixarr[i]=fix.nextInt(46);
			
			for(int j=0; j<i; i++) {
				if(rarr[i]==rarr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("���� ��ȣ :"+Arrays.toString(rarr));
		
		System.out.println("��÷ ��ȣ :"+Arrays.toString(fixarr));
		
		if(rarr==fixarr) {
			System.out.println("��÷ ���� : ��÷�Ǿ����ϴ�.");
		}
		else {
			System.out.println("��÷ ���� : ��÷���� �ʾҽ��ϴ�.");
		}	
	
	
	}

}
