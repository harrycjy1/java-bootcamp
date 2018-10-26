package sec00_verify;

public class MyMathMethod {

	long a ;
	long b ;
	

	public long getA() {
		return a;
	}
	public void setA(long a) {
		this.a = a;
	}
	public long getB() {
		return b;
	}
	public void setB(long b) {
		this.b = b;
	}
	
	
	
	
			 static long add(long a,long b){
				return a+b;
			}
			 static long subtract(long a,long b){
				return a-b;
			}	
			 static long multiply(long a,long b){
				 
				return a*b;
			}
			 static long divide(long a,long b){
				
				return a/b;
			}
			//스태틱 매서드
			
			
			
			
			
			//인스턴스 매서드
			public long add() {
				return add(a, b);
			}
			public long subtract() {
				return subtract(a,b);
			}
			public long multiply() {
				return multiply(a,b);
			}
			public long divide() {
				return divide(a,b);
			}
			
}
