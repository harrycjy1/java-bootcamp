package sec_verify03;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class WordCountExample {

	public static void main(String[] args) {
		
		System.out.println("���� �� �ܾ ���ϴ� ���α׷��Դϴ�.(���� : Ctrl+Z)");
		System.out.println("���ڿ��� �Է��ϼ���(������ ���ڿ� ������)");
		Scanner scan = new Scanner(System.in);
		
		Vector<String> v = new Vector<String>();
		
		try {
			while(true) {
				String input = scan.nextLine();
				v.add(input);
			}
	
		}
		
		catch(NoSuchElementException e) {
			
			for(int i=0; i<v.size(); i++) {
				for(int j=0; j<v.size()-1; j++) {
					if(v.get(j).length() < v.get(j+1).length()) {
						v.set(j, v.get(j+1)); //vector ����
					}
				}
			}
		System.out.println("���� �� �ܾ��"+v.get(0)+"�Դϴ�.");
		}
		

	}
	
}
