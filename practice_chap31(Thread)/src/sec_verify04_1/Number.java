package sec_verify04_1;

public class Number {

	
	public synchronized void addNum() {
		int count =0;
		
		for(int i=1; i<1000; i++) {
			count+=i;
		}
		System.out.println(count);
		
	}
}
