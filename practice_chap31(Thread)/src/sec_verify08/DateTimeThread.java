package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTimeThread extends Thread{
	
	
	
	@Override
	public void run() {
	
	while(true) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("���� ��¥ �� �ð� : "+sf.format(cal.getTime()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
		
		
	}

}
