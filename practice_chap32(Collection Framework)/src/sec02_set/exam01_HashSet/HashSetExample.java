package sec02_set.exam01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//Set계열은 중복저장이 안된다. 아울ㄹ러 인덱스로 관리도 안됨
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		
		//결과가 4이다 이유는?
		System.out.println("총 객체 수 : "+size);
		
		//반복자
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		size=set.size();
		System.out.println();
		System.out.println("총 객체 수 : "+size);
		
		for(String str : set)
			System.out.println("\t"+str);
		
		set.clear();
		
		if(set.isEmpty())
			System.out.println("객체가 없습니다.");
		else
			System.out.println("객체가 있습니다.");
	
	
	}

}
