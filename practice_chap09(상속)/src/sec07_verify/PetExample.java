package sec07_verify;

public class PetExample {

	public static void main(String[] args) {

		Dog d = new Dog();
		Bird b = new Bird();
		
		d.weight=10;
		d.name="������";
		
		b.type="�޹���";
		b.flightYN=true;
		
		d.move();
		b.move();
	}

}
