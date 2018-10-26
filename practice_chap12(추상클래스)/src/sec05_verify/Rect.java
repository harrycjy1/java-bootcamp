package sec05_verify;

public class Rect extends Shape{

	
	double width;
	double height;
	
	Rect(double width,double height){
		this(new Point(0,0),width,height);
	}
	
	Rect(Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}

	boolean isSquare() {
		
		return false;
	}

	@Override
	double calcArea() {
	
	return this.width*this.height;
}


}
	