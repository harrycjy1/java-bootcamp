package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {

	public static void main(String[] args) {
		
		
		Car c1 = new Car("SM5-����",4);
		Car c2 = new Car("SM7-����",4);
		Car c3 = new Car("SM5-����",4);
		
		
		
		if(Objects.compare(c1, c2, new CarComparator())==1)
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		
		else 
			System.out.println("c1�� c2�� �ٸ� �����Դϴ�.");
		
		
		if(Objects.compare(c1, c3, new CarComparator())==1)
			System.out.println("c1�� c3�� ���� �����Դϴ�.");
		else
			System.out.println("c1�� c3�� �ٸ� �����Դϴ�.");
		

	}

}
