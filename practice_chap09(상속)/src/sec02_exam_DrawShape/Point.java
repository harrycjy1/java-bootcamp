package sec02_exam_DrawShape;

public class Point {

		int x;
		int y;
		
		//기본 생성자
		public Point() {
			this(0,0); //this 또다른 생성자를 호출, this(자기자신의 인스턴스를의 의미)
		}
		
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			
		}
		
		//좌표값 반환
		
		public String getXY() {
			return "("+this.x+", "+this.y+")"; //x와 y값을 문자열로 반환
		}	
		

}
