package sec02_exam_DrawShape;

public class Point {

		int x;
		int y;
		
		//�⺻ ������
		public Point() {
			this(0,0); //this �Ǵٸ� �����ڸ� ȣ��, this(�ڱ��ڽ��� �ν��Ͻ����� �ǹ�)
		}
		
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			
		}
		
		//��ǥ�� ��ȯ
		
		public String getXY() {
			return "("+this.x+", "+this.y+")"; //x�� y���� ���ڿ��� ��ȯ
		}	
		

}
