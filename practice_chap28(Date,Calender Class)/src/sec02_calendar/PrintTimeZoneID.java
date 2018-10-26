package sec02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
			//��� TimeZone�� ID���� ��´�.
		String[] availableIDs = TimeZone.getAvailableIDs();
		
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
		Calendar now = Calendar.getInstance(tz);
		
		int year 	= now.get(Calendar.YEAR);
		int month 	= now.get(Calendar.MONTH)+1;
		int day 	= now.get(Calendar.DAY_OF_MONTH);
		int hour 	= now.get(Calendar.HOUR);
		int minute 	= now.get(Calendar.MINUTE);
		int second 	= now.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+day+"��"+hour+"��"+minute+"��"+second+"��");

	}

}
