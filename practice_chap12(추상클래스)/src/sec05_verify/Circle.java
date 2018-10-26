package sec05_verify;

public class Circle extends Shape{
	
	
	double r;
	
	Circle(double r){
		this(new Point(),r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	
	
	@Override
	double calcArea() {
		
		return (Math.PI*r*r);
	}
	

}
