package sec_verify04;

import java.util.Random;

public class RandomGraphExample {

	
	
	
	static String printGraph(char ch, int value) {
		
		int[] counter = new int[value]; 
		
		Random ran = new Random();
		
		for(int i=0; i<100; i++) {
			int r = ran.nextInt(10);
			counter[r]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(i+"�� ���� : ");
			for(int j=0; j<counter[i]; j++) {
			System.out.print(ch);	
			}
			System.out.println(" "+counter[i]);
		}
		
		
		return  "";
	}
	
	
	
	public static void main(String[] args) {
	
		RandomGraphExample.printGraph('#', 10);
		
	
		/*
		0�� ���� :######### 9
		1�� ���� :########## 10
		2�� ���� :########## 10
		3�� ���� :########### 11
		4�� ���� :######### 9
		5�� ���� :##### 5
		6�� ���� :############# 13
		7�� ���� :####### 7
		8�� ���� :############## 14
		9�� ���� :############ 12*/
		
		
		
		
		
	}

}
