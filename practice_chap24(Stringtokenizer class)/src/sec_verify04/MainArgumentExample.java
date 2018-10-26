package sec_verify04;

import java.util.Arrays;


public class MainArgumentExample {

	public static void main(String[] args) {
		
		String str = "나는=김지훈&ID=perpear&국어점수=90&수학점수=98&자바점수=100";
		
		System.out.println("명령행 인자값 : "+str);

		String[] a = str.split("=|&");
		
		for(int i=0; i<a.length; i+=2) {
			System.out.println(a[i]+"  "+a[i+1]);
		}
	
	
	}
	
}
