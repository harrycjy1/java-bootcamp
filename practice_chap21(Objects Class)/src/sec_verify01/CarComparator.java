package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{

	public int compare(Car a, Car b) {
		if(a.model.equals(b.model)) {
			return 1;
		}
		else {
			return 0;
			}
	}

	
}
