package sec07_verify;

public class Dog extends Pet{

	
		String name;
		int weight;
		
		int getWeight() {
			return weight;
		}

		@Override
		void move() {
			System.out.println("강아지가 움직이네요");
			System.out.println("강아지의 이름은 "+this.name+"이고, 몸무게는 "+this.weight+"Kg입니다.");
		}


























}
