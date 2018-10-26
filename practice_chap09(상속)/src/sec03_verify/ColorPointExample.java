package sec03_verify;

public class ColorPointExample {

	public static void main(String[] args) {
		
		ColorPoint c1 = new ColorPoint();
		c1.set(3, 4);
		c1.setColor("레드");
		c1.showColorPoint();

		ColorPoint c2 = new ColorPoint();
		c1.set(10, 50);
		c1.setColor("블루");
		c1.showColorPoint();
		
		ColorPoint c3 = new ColorPoint();
		c1.set(20, 17);
		c1.setColor("노랑");
		c1.showColorPoint();
		
		ColorPoint c4 = new ColorPoint();
		c1.set(2, 1);
		c1.setColor("그린");
		c1.showColorPoint();
		
		
		
	}

}
