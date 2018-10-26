package sec01_verify;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter out = new Outter();
		Outter.Inner in = out.new Inner();
		
		in.method();
		
	}

}
