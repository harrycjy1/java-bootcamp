package sec_verify04;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run  = true;
		
		while(run) {
			System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է� �� : 2016/01/01)");
			String input = scan.nextLine();
			Calendar cal = Calendar.getInstance();
			final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
			try {
				String[] arr = input.split("/");
				cal.set(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
				System.out.println("�Է��Ͻ� ��¥�� "+DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]+"�����Դϴ�.");
				run=false;
			}
			
			catch(Exception e) {
				System.out.println("���� �߻�-->��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է� �� : 2016/01/01)");
			}
		}
		
		
			
			
		

	}

}
