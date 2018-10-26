package sec05_verify;

public class ShapeExample {
	
	
	Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
	
	static void sumArea(Shape[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Circle) {
				System.out.println("Circle 면적의 합 : "+ arr[i].calcArea());
			}
			else {
				System.out.println("Rect면적의 합 : "+ arr[i].calcArea());
			}
		}
			
		
		
	}

	public static void main(String[] args) {
		
		ShapeExample a = new ShapeExample();
		
		ShapeExample.sumArea(a.arr);

	

}
}