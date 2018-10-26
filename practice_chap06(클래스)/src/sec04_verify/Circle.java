package sec04_verify;

public class Circle {

	
	private int 		radius;
	private String 		name;
	
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
		 //Math.PI = 파이값 , Math.po(i,j)는 i의 j제곱값.
	}
	

	
	@Override
	public String toString() {
		String str= getName()+"의 면적은 "+getArea();
		return str;
	}
	
	
	
}
