package sec01_exam;

public class MyMath {

	
	//2개의 인스턴스 멤버메서드,2개의 static메서드
	//return문은 항상 1개로 즉 최소화시켜주는게 좋다
	long a,b=0;
	
	public long add(long a,long b) {
		long result=a+b;
		return result;
		//return a+b; 위의 두줄을 이와같이 한줄로 간단히 할수 있다.
		
	}


	public long subtract(long a, long b) {
		//MyMath.multiply(a, b); //static메서드를 인스턴스안에 넣는건 가능하다.
		return a-b;
	}
	
	public static long multiply(long a,long b) {
		return a*b;
	}

	public static long divide(long a, long b) {
		return a/b;
	}

	public String studyJava() {
		//MyMath.divide(a, b);
		return "자바수업을 합니다.";    //인스턴스메서드안에선 static넣기 가능
								   //but, static메서드안에 instance메서드를 넣을순 없다.	
	}









}
