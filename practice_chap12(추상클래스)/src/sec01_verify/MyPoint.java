package sec01_verify;

public abstract class MyPoint {

		int x;
		int y;
	
		MyPoint(int x,int y){
			this.x=x;
			this.y=y;
		}
	
		protected abstract void move(int x, int y);
		
		protected abstract void reverse();

		protected void show() {
			System.out.println("���� x, y�� ��: "+this.x+this.y);
		}
		
}
