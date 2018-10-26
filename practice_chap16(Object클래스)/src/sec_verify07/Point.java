package sec_verify07;

public class Point implements Cloneable{

	int 	xPos;
	int  	yPos;
	
	public Point(int xPos,int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
	}
	
	public void changePos(int x,int y) {
		this.xPos=x;
		this.yPos=y;
	}
	
	public void showPosition() {
		System.out.println("["+this.xPos+", "+this.yPos+"]");
	}
	
	
	
	public Object clone() throws CloneNotSupportedException {
		
		
		return super.clone();
	}
	
	
}
