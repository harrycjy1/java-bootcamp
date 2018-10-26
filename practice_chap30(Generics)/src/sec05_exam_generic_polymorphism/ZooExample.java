package sec05_exam_generic_polymorphism;

public class ZooExample {

	public static void main(String[] args) {
		
		ZooBox<Animal> animal = new ZooBox<>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird());
		//animal.add(new Object());
		
		//extends Animal 때문에 animal과 animal을 상속받은 클래스만 올수 있음
		
		System.out.println("Animal이거나 Animal을 상속받은 값만 출력합니다.");
		System.out.println(animal.toString());

	}

}
