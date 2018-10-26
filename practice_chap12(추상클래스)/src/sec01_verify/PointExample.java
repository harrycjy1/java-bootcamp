package sec01_verify;

public class PointExample {

	public static void main(String[] args) {
		
		MyColorPoint co = new MyColorPoint(2, 3, "blue");
		
		co.show();
		co.move(4, 3);
		co.reverse();
		co.show();

	}

}
