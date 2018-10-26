package sec_verify02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongStringSearch {
	
	Scanner scan = new Scanner(System.in);

	private ArrayList<String> stringList;
	
	public LongStringSearch() {
		System.out.print("몇개의 이름을 입력하실껀가요? >>");
		int size = scan.nextInt();
		this.stringList = new ArrayList<>(size);
		System.out.println(size+"만큼의 ArrayList가 생성되었습니다.");
		System.out.println();
	}
	
	public void addString(String name) {
		
		stringList.add(name);
		
	}
	
	public void listprint() {
		for(int i=0; i<stringList.size(); i++) {
			System.out.println(i+"번째 ArrayList객체 값 : "+stringList.get(i));
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
		System.out.println("가장 긴 이름은 "+text+"입니다.");
		
	}

	public ArrayList<String> getStringList() {
		return this.stringList;
	}
	
	
	
}
