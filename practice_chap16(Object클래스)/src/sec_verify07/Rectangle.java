package sec_verify07;

public class Rectangle implements Cloneable{

	Point 	upperLeft;
	Point 	lowerRight;
	
	public Rectangle(int a, int b, int c, int d) {
		this.upperLeft = new Point(a,b);
		this.lowerRight = new Point(c,d);
	}
	
	public void showposition() {
		System.out.println("[직사각형 위치 정보 ]");
		System.out.print("좌 상단 :");
		upperLeft.showPosition();
		System.out.print("우 하단 :");
		lowerRight.showPosition();
	}
	
	public void changePos(int a,int b, int c, int d) {
		this.upperLeft.changePos(a, b);
		this.lowerRight.changePos(c, d);
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		Rectangle cloned = (Rectangle)super.clone();
		
		cloned.upperLeft=(Point) upperLeft.clone();
		cloned.lowerRight=(Point) lowerRight.clone();
		
		return cloned;
	}
	
}
