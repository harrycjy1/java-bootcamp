package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		
		String 	str = "���̵�,�̸�,�н�����";
		
		System.out.println("String�� split()�� �̿��� ���");
		
		String[] a = str.split(",");
		for(String i : a) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("StringTokenizer�� �̿��� ���");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
