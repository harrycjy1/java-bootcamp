package sec02_exam_DrawShape;

public class Triangle extends Shape{

	
	
		//���� 3���� �־�� ��μ� �ﰢ���� �ϼ��ǹǷ�, point�� �迭�� �����ߵ�
		Point[] p = null;//���԰���
		
		//������
		public Triangle(Point[] p) {
			super();
			this.p=p;
		}
	
		//�������̵�
		@Override
		public void draw() {
			System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",this.p[0].getXY(), this.p[1].getXY(),this.p[2].getXY(),this.color);
		}
	
	
}
