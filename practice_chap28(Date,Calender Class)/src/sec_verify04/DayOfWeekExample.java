package sec_verify04;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run  = true;
		
		while(run) {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력 예 : 2016/01/01)");
			String input = scan.nextLine();
			Calendar cal = Calendar.getInstance();
			final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
			try {
				String[] arr = input.split("/");
				cal.set(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
				System.out.println("입력하신 날짜는 "+DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
				run=false;
			}
			
			catch(Exception e) {
				System.out.println("예외 발생-->날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력 예 : 2016/01/01)");
			}
		}
		
		
			
			
		

	}

}
