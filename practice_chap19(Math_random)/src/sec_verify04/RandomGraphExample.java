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
			System.out.print(i+"의 개수 : ");
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
		0의 개수 :######### 9
		1의 개수 :########## 10
		2의 개수 :########## 10
		3의 개수 :########### 11
		4의 개수 :######### 9
		5의 개수 :##### 5
		6의 개수 :############# 13
		7의 개수 :####### 7
		8의 개수 :############## 14
		9의 개수 :############ 12*/
		
		
		
		
		
	}

}
