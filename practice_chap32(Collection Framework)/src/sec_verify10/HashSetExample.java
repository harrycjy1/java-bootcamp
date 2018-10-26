package sec_verify10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		Iterator<String> it = set.iterator();
		int i=1;
		while(it.hasNext()) {
			
			System.out.println(i+"¹øÂ° °´Ã¼ : "+it.next());
			i++;
		}

	}

}
