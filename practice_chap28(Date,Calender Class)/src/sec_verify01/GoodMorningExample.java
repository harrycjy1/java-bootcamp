package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

		
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		
		
		System.out.println("������" + now.get(Calendar.HOUR_OF_DAY)+"�� "+now.get(Calendar.MINUTE)+"�� �Դϴ�.");
		
		if(now.get(Calendar.HOUR_OF_DAY)<12&&now.get(Calendar.HOUR_OF_DAY)>=4) {
			System.out.println("�����̳׿�!! GoodMorning");
		}
		else if(now.get(Calendar.HOUR_OF_DAY)>=12&&now.get(Calendar.HOUR_OF_DAY)<18) {
			System.out.println("���ĳ׿�");
		}
		else if(now.get(Calendar.HOUR_OF_DAY)>=18&&now.get(Calendar.HOUR_OF_DAY)<22){
			System.out.println("�����̳׿�");
		}
	}

}
