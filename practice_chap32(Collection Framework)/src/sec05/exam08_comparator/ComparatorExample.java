package sec05.exam08_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparator());
		//treeSet에 Fruit객체를 추가한다.
		//여기서 Fruit클래스에 Comparable<>인터페이스를 구현하지 않거나, Comparator<>를
		//제공하지 않으면 ClassCastException이 발생한다.
		
		try {
		treeSet.add(new Fruit("포도",6500));
		treeSet.add(new Fruit("딸기",4200));
		treeSet.add(new Fruit("복숭아",3500));
		treeSet.add(new Fruit("바나나",3400));
		treeSet.add(new Fruit("자두",2000));
		treeSet.add(new Fruit("호박",1001));
		}
		
		catch(Exception e){
			System.out.println("정렬 기준이 없음");
		}
		System.out.println("총 객체 수 : "+treeSet.size());
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName()+" : "+fruit.getPrice());
		}
		

	}

}
