package sec11_verify;

import java.util.Scanner;

public class Player {

	Scanner scan;
	private String name;
	private String word;
	
	//final int NUM = 0;
	
	public Player(String name) {
		this.name = name;
		scan = new Scanner(System.in);
	}
	
	public String getName() {
		return this.name;
		
	}

	public String sayWord() {
		System.out.print(name +">>");
		word = scan.next();
		return word;
		
	}

		//lastword와 참가자가 말한 word를 비교하여 끝말잇기가 잘되었는지 판단.
		//성공하였으면 true리턴
	
	public boolean succeed(String lastWord) {
		int lastindex = lastWord.length()-1;
		
		if(lastWord.charAt(lastindex)==word.charAt(0)) {
			return true;
		}
			else {
			return false;
		}
			
	}









}
