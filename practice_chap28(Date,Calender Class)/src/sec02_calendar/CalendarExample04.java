package sec02_calendar;

import java.util.Calendar;

public class CalendarExample04 {

	public static void main(String[] args) {
		
			Calendar date = Calendar.getInstance();
			
			date.set(2016,10,1);//2016�� 11�� 1�Ϸ� ����
			System.out.println(toString(date));
			System.out.println("= 1�� �� =");
			date.add(Calendar.DATE, 1);
			System.out.println(toString(date));
			
			System.out.println("= 12 �� �� =");
			date.add(Calendar.MONTH, -12);
			System.out.println(toString(date));
			
			System.out.println("= 35�� �� =");
			date.add(Calendar.DATE, 35);
			System.out.println(toString(date));
			
			//roll�޼���� �ٸ��ʵ忡 ������ ���� �ʴ´�
			System.out.println("= 25�� �� (roll) =");
			date.roll(Calendar.DATE, 25);
			System.out.println(toString(date));
			
			date.roll(Calendar.MONTH, 3);
			System.out.println(toString(date));
	
	}

	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"+date.get(Calendar.DATE)+"��";
	}
}
