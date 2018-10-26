package sec02_exam_DrawShape;

public class Circle extends Shape {

				Point center = null;	//원의 원점좌표(포함관계)
				int r;					//반지름
				
				//Circle(point center, int r)를 호출
				public Circle() {
					//this(point 클래스의 인스턴스 주소값,100)을 가지는 생서자를 호출
					this(new Point(0,0),100);
					//this(center,100);
				}
				
				//center는 point의 참조변수(주소값), r=100
				public Circle(Point center, int r) {
					super(); 				//조상클래스의 생성자를 호출함, 컴파일러가 알아서 호출
					this.center =center; 	//0,0
					this.r=r; 				//100
				}
				
				//조상클래스의 멤버메서드인 draw()를 오버라이딩함
				//원을 그리는 대신의 원의 정보를 출력하도록 했다.
				//(오버라이딩 : 선언부가 무조건 같고, 구현부만 다르게 구현함)
				@Override
				public void draw() {
					System.out.println("[center(원점) = ("+this.center.x+", "+this.center.y+"),"+" r(반지름) = "+this.r+", color(색깔) = "+ this.color+"]");
				}







}
