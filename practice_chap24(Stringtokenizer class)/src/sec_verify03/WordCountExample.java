package sec_verify03;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class WordCountExample {

	public static void main(String[] args) {
		
		System.out.println("가장 긴 단어를 구하는 프로그램입니다.(종료 : Ctrl+Z)");
		System.out.println("문자열을 입력하세요(공백은 문자에 미포함)");
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
						v.set(j, v.get(j+1)); //vector 소팅
					}
				}
			}
		System.out.println("가장 긴 단어는"+v.get(0)+"입니다.");
		}
		

	}
	
}
