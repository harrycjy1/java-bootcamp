package sec_verify02;

import java.util.Calendar;

public class FirstDateExample {

	static void printCalendar(String str, Calendar date) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		System.out.print(str+date.get(Calendar.YEAR)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.DATE)+"/"
				+DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]+"요일 ("
				+date.get(Calendar.HOUR_OF_DAY)+"시)");
		
		if(date.get(Calendar.AM_PM)==0)
			System.out.print("오전");
		else
			System.out.print("오후");
		
		System.out.println(date.get(Calendar.HOUR)+"시 "
				+date.get(Calendar.MINUTE)+"분 "+date.get(Calendar.SECOND)+"초"+date.get(Calendar.MILLISECOND)+"밀리초");
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		   printCalendar("현재 ", now);

		   Calendar firstDate = Calendar.getInstance();
		   firstDate.clear();
		   firstDate.set(2012, 11, 25); // 2012년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
		   firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
		   firstDate.set(Calendar.MINUTE, 30); // 30분
		   printCalendar("처음 데이트한 날은 ", firstDate);

	}

}
