package sec03_verify;

public class AnimalExample {

	public static void main(String[] args) {
		
		
		Animal a = new Cat();
		
		System.out.println("---------------------------------------");
		a.breathe();
		a.kind="������";
		a.sound();
		System.out.println("---------------------------------------");
		Animal b = new Dog();
		b.breathe();
		b.kind="������";
		b.sound();
		System.out.println("---------------------------------------");
		Animal c = new Tree_Sparrow();
		c.breathe();
		c.kind="����";
		c.sound();
		System.out.println("---------------------------------------");
		
		
		
	}

}
