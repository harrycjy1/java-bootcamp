package sec04_verify;

public class PrinterExample {

	public static void main(String[] args) {
		
		Printer p1= new LaserPrinter("SCX-6x45", "»ï¼ºÀüÀÚ", 3, 0, 20);
		Printer p2= new InkjetPrinter("Officejet V40", "HP", 5, 0, 10);
		for(int i=0; i<5; i++) {
			p1.print();
			p2.print();
		}
		

	}

}
