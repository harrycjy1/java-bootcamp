package sec_verify05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayDifferenceExample {
	static int 	getDayDiff	(String s1, String s2) throws ParseException {
		
		
			SimpleDateFormat format= new SimpleDateFormat("yyyyMMdd");
			Date num1 = format.parse(s1);
			Date num2 = format.parse(s2);
			Calendar cal = Calendar.getInstance();
			cal.setTime(num1);
			int first = cal.get(Calendar.DAY_OF_YEAR);
			cal.setTime(num2);
			int second = cal.get(Calendar.DAY_OF_YEAR);
			
			int result = second - first;
			return result;
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		try {
		System.out.println("2016년01월03일 - 2016년 02월 01일의 차이 : " + getDayDiff("20160103","20160201") + "일");
		System.out.println("2016년01월03일 - 2016년 01월 03일의 차이 : " + getDayDiff("20160103","20160103") + "일");
		System.out.println(" " + getDayDiff("20010103","200103"));
		}
		catch(Exception e) {
			System.out.println("파싱 예외 발생()");
		}
		
	}

}
