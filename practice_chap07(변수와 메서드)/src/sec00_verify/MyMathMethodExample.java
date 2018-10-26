package sec00_verify;

public class MyMathMethodExample {

	public static void main(String[] args) {
		
			long a=200L;
			long b=100L;
		
		//스태틱 클래스 new연산자 필요 x
		
		System.out.println("클래스(static)메서드 add 호출\t"+MyMathMethod.add(a,b));
		System.out.println("클래스(static)메서드 subtract 호출\t"+MyMathMethod.subtract(a, b));
		System.out.println("클래스(static)메서드 multiply 호출\t"+MyMathMethod.multiply(a, b));
		System.out.println("클래스(static)메서드divide 호출\t"+MyMathMethod.divide(a, b));
		System.out.println();
		
		System.out.println();
		
		//인스턴스 클래스 new연산자 필요o
		
		MyMathMethod math=new MyMathMethod();
		
		math.setA(200);
		math.setB(100);
		
		System.out.println("인스턴스 메서드 add 호출\t"+math.add());
		System.out.println("인스턴스 메서드 subtract 호출\t"+math.subtract());
		System.out.println("인스턴스 메서드 multiply 호출\t"+math.multiply());
		System.out.println("인스턴스 메서드 divide 호출\t"+math.divide());
	
	
	}

}
