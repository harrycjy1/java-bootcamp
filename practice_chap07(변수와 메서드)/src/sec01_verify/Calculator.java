package sec01_verify;

import java.util.concurrent.SynchronousQueue;

public class Calculator {

	int x;
	int y;

	
	
	public int plus(int x,int y) {
		System.out.println("result1: "+ (x+y));
		return x+y;
	}
	
	public double divide(int x,int y) {
		System.out.println("result1: "+ ((double)x/(double)y));
		return x/y;
	}
	
	public void powerOn() {
		System.out.println("���� ������ �մϴ�.");
	}
	
	public void powerOff() {
		System.out.println("���� ������ ���ϴ�.");
	}
		
	
	
}
