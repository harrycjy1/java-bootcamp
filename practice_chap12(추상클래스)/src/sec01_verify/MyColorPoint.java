package sec01_verify;

public class MyColorPoint extends MyPoint{

	String 	color;
	
	MyColorPoint(int x,int y,String color){
		super(x,y);
		this.color = color;
		
	}
	
	protected void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
	protected void reverse() {
		System.out.println("x와 y의 값을 바꿨습니다.");
	}
	protected void show() {
		System.out.println("현재 x,y의 값 : "+this.x+", "+this.y+", "+this.color);
	}
	
	
}
