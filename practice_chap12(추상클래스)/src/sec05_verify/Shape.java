package sec05_verify;

public abstract class Shape {

	
	Point p;
	
	Shape(){
		this(new Point());
	}
	
	Shape (Point p){
		this.p=p;
	}
	
	Point getPosition() {
		return p;
	}
	Point setPosition(Point p) {
		return this.p=p;
	}
	abstract double calcArea();
	
}
