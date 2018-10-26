package sec01_verify;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소수 입력 : ");
		
		
		int input = scan.nextInt();
		
		int[] star= new int[input];
		
		for(int i=0; i<star.length; i++) {
			star[i]= rand.nextInt(10)+1;//nextint10하면 0~9이므로 1더해준다
		}
		for(int i=0; i<star.length; i++) {
			System.out.print("a["+i+"] :" );
			for(int j=0; j<star[i]; j++) {  //j<star[i]갯수만큼 반복 해서 별을 찍어야함
				System.out.print("*");
			}
		System.out.println();//줄바꿈
		}
		
		
		
	}

}
