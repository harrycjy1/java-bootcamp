package sec_verify02;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기 프로그램입니다.\r\n" + 
				"자동으로 번호를 선택합니다.");
		
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
		System.out.println("선택 번호 :"+Arrays.toString(rarr));
		
		System.out.println("당첨 번호 :"+Arrays.toString(fixarr));
		
		if(rarr==fixarr) {
			System.out.println("당첨 여부 : 당첨되었습니다.");
		}
		else {
			System.out.println("당첨 여부 : 당첨되지 않았습니다.");
		}	
	
	
	}

}
