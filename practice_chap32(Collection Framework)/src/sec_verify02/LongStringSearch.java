package sec_verify02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongStringSearch {
	
	Scanner scan = new Scanner(System.in);

	private ArrayList<String> stringList;
	
	public LongStringSearch() {
		System.out.print("��� �̸��� �Է��Ͻǲ�����? >>");
		int size = scan.nextInt();
		this.stringList = new ArrayList<>(size);
		System.out.println(size+"��ŭ�� ArrayList�� �����Ǿ����ϴ�.");
		System.out.println();
	}
	
	public void addString(String name) {
		
		stringList.add(name);
		
	}
	
	public void listprint() {
		for(int i=0; i<stringList.size(); i++) {
			System.out.println(i+"��° ArrayList��ü �� : "+stringList.get(i));
		}
		System.out.println();
	}
	
	public void longestString() {
		String text="";
		for(int i=0; i<stringList.size(); i++) {
			if(text.length()<stringList.get(i).length()) {
				text = stringList.get(i);
			}
		}
		System.out.println("���� �� �̸��� "+text+"�Դϴ�.");
		
	}

	public ArrayList<String> getStringList() {
		return this.stringList;
	}
	
	
	
}
