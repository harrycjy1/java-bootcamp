package sec06_verify;

public class GoodCalc extends Calculator{
	
	
	int add(int x, int y) {
		
		return x+y;
	}
	int subtract(int x, int y) {
		
		return x-y;
	}
	
	double average(int[] a) {
		double sum=0;
		double avg=0;
		for(int i =0; i<a.length; i++) {
			sum += a[i];
			avg = sum/a.length;
		}
		
		return avg;
	}
	
	
	
	
	
	
	
	
	
	

}
