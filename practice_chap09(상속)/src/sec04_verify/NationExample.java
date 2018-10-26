package sec04_verify;

public class NationExample {

	public static void main(String[] args) {
		
		Korea k=new Korea();
		China c=new China();
		
		k.country="korea";
		c.country="china";
		
		System.out.println(c.toString());
		System.out.println(k.toString());

	}

}
