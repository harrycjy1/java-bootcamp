package sec06_verify;

import java.util.Scanner;

public class MyTvExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MyTvClass tv = new MyTvClass();
		
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		tv.setChannel(500);
		tv.setChannel(input1);
		tv.setChannel(input2);
		
		System.out.println(tv.getChannel());
		System.out.println(tv.getPrevChannel());
		
		tv.setVolume(600);
		tv.setVolume(25);
		tv.setVolume(20);
		System.out.println(tv.getPrevVolume());
		System.out.println(tv.getVolume());
	}

}
