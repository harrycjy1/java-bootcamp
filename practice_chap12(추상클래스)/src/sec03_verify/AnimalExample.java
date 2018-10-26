package sec03_verify;

public class AnimalExample {

	public static void main(String[] args) {
		
		
		Animal a = new Cat();
		
		System.out.println("---------------------------------------");
		a.breathe();
		a.kind="포유류";
		a.sound();
		System.out.println("---------------------------------------");
		Animal b = new Dog();
		b.breathe();
		b.kind="포유류";
		b.sound();
		System.out.println("---------------------------------------");
		Animal c = new Tree_Sparrow();
		c.breathe();
		c.kind="조류";
		c.sound();
		System.out.println("---------------------------------------");
		
		
		
	}

}
