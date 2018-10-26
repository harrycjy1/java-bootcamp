package sec06_1_verify;

public class RectangleClass {

	
	
	double 	areaRectangle(double a) {
		double result = a*a;
		return result;
	}

	double areaRectangle(double a, double b) {
		double result = a*b;
		return result;
	}

	//example
	public static void main(String[] args) {
		
		RectangleClass rec = new RectangleClass();
		
		System.out.println("정사각형 넓이 = "+rec.areaRectangle(10));
		System.out.println("직사각형 넓이 = "+rec.areaRectangle(10,20));
		

	}

	
	
	
	
	
	
	
	
	
	
}
