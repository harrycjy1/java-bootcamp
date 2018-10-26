package sec05_exam_generic_polymorphism;

public class ZooExample {

	public static void main(String[] args) {
		
		ZooBox<Animal> animal = new ZooBox<>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird());
		//animal.add(new Object());
		
		//extends Animal ������ animal�� animal�� ��ӹ��� Ŭ������ �ü� ����
		
		System.out.println("Animal�̰ų� Animal�� ��ӹ��� ���� ����մϴ�.");
		System.out.println(animal.toString());

	}

}
