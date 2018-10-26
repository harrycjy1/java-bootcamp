package sec01_verify;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int x =7;
		int y =4;
		
		cal.powerOn();
		cal.plus(x,y);
		cal.divide(x, y);
		cal.powerOff();
	}

}
