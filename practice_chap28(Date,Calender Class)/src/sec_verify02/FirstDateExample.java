package sec_verify02;

import java.util.Calendar;

public class FirstDateExample {

	static void printCalendar(String str, Calendar date) {
		
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		
		System.out.print(str+date.get(Calendar.YEAR)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.DATE)+"/"
				+DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]+"���� ("
				+date.get(Calendar.HOUR_OF_DAY)+"��)");
		
		if(date.get(Calendar.AM_PM)==0)
			System.out.print("����");
		else
			System.out.print("����");
		
		System.out.println(date.get(Calendar.HOUR)+"�� "
				+date.get(Calendar.MINUTE)+"�� "+date.get(Calendar.SECOND)+"��"+date.get(Calendar.MILLISECOND)+"�и���");
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		   printCalendar("���� ", now);

		   Calendar firstDate = Calendar.getInstance();
		   firstDate.clear();
		   firstDate.set(2012, 11, 25); // 2012�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ����
		   firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8��
		   firstDate.set(Calendar.MINUTE, 30); // 30��
		   printCalendar("ó�� ����Ʈ�� ���� ", firstDate);

	}

}
