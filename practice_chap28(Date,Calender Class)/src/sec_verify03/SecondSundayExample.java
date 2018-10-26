package sec_verify03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondSundayExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();

		
		now.set(2016,0,1); //2016년 1월 1일로 셋팅
		
		for(int i=0; i<366; i++) {
			now.add(Calendar.DATE, 1);
			
			if(now.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2 && now.get(Calendar.DAY_OF_WEEK)==1) 
			{
				Date now1 = now.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String result = sdf.format(now1);
				System.out.println(result+"은 2번째 일요일입니다.");
			}
		}		
		
		
		
		
		
	}
}
