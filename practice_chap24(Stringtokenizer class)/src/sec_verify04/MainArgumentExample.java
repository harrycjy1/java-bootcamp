package sec_verify04;

import java.util.Arrays;


public class MainArgumentExample {

	public static void main(String[] args) {
		
		String str = "����=������&ID=perpear&��������=90&��������=98&�ڹ�����=100";
		
		System.out.println("����� ���ڰ� : "+str);

		String[] a = str.split("=|&");
		
		for(int i=0; i<a.length; i+=2) {
			System.out.println(a[i]+"  "+a[i+1]);
		}
	
	
	}
	
}
