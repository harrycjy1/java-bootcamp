package sec05.exam08_comparator;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Fruit>{

	public int compare(Fruit o1, Fruit o2) {
		
		return Integer.compare(o1.getPrice(),o2.getPrice());
	}

	
}
