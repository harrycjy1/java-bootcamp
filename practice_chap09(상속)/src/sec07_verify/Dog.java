package sec07_verify;

public class Dog extends Pet{

	
		String name;
		int weight;
		
		int getWeight() {
			return weight;
		}

		@Override
		void move() {
			System.out.println("�������� �����̳׿�");
			System.out.println("�������� �̸��� "+this.name+"�̰�, �����Դ� "+this.weight+"Kg�Դϴ�.");
		}


























}
