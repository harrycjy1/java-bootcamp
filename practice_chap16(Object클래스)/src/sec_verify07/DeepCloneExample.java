package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 10, -5, -5);
		System.out.println("원래 직사각형의 포인트");
		r1.showposition();
		System.out.println();//줄띄우기
		
		try{
			System.out.println("복제된 직사각형의 포인트");
			Rectangle r2 =(Rectangle) r1.clone();
			r2.changePos(2, 2, 7, 7);
			r2.showposition();
			}
		catch(CloneNotSupportedException e) {
			System.out.println("오류");
		}

	
	}

}
