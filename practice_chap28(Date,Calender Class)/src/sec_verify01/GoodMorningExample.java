package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

		
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		
		
		System.out.println("지금은" + now.get(Calendar.HOUR_OF_DAY)+"시 "+now.get(Calendar.MINUTE)+"분 입니다.");
		
		if(now.get(Calendar.HOUR_OF_DAY)<12&&now.get(Calendar.HOUR_OF_DAY)>=4) {
			System.out.println("오전이네요!! GoodMorning");
		}
		else if(now.get(Calendar.HOUR_OF_DAY)>=12&&now.get(Calendar.HOUR_OF_DAY)<18) {
			System.out.println("오후네요");
		}
		else if(now.get(Calendar.HOUR_OF_DAY)>=18&&now.get(Calendar.HOUR_OF_DAY)<22){
			System.out.println("저녁이네요");
		}
	}

}
