package sec02_exam_DrawShape;

public class Circle extends Shape {

				Point center = null;	//���� ������ǥ(���԰���)
				int r;					//������
				
				//Circle(point center, int r)�� ȣ��
				public Circle() {
					//this(point Ŭ������ �ν��Ͻ� �ּҰ�,100)�� ������ �����ڸ� ȣ��
					this(new Point(0,0),100);
					//this(center,100);
				}
				
				//center�� point�� ��������(�ּҰ�), r=100
				public Circle(Point center, int r) {
					super(); 				//����Ŭ������ �����ڸ� ȣ����, �����Ϸ��� �˾Ƽ� ȣ��
					this.center =center; 	//0,0
					this.r=r; 				//100
				}
				
				//����Ŭ������ ����޼����� draw()�� �������̵���
				//���� �׸��� ����� ���� ������ ����ϵ��� �ߴ�.
				//(�������̵� : ����ΰ� ������ ����, �����θ� �ٸ��� ������)
				@Override
				public void draw() {
					System.out.println("[center(����) = ("+this.center.x+", "+this.center.y+"),"+" r(������) = "+this.r+", color(����) = "+ this.color+"]");
				}







}
