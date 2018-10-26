package sec05_exam_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		//calendarŬ������ �ν��Ͻ��� ���Ϲ���.(�̱��� ����)
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//��(1)~��(7)����//�����ε�get
		int year = cal.get(Calendar.YEAR);	//�⵵ ����
		int month = cal.get(Calendar.MONTH); //�� (0~11�� ������)
				
		//int year = cal.get(Calendar.YEAR);
		//��, ����, �ð�,��,�� ���� ���� ���� ������� ������ �ִ�. API�� ã�ƺ���
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("���ش�" + year);
		System.out.println("���� " + (month+1));
		System.out.println("���� �� : " + minute);
		
		//week�� 1~7������ �������� ������ �ִ�.
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
			
		}
		
		System.out.println("���� ���� : " + today);
		if(today == Week.SUNDAY||today==Week.SATURDAY) {
			System.out.println("��, �Ͽ��� ������ ���ָ� ���ʴϴ�.");
			
		}
		else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
