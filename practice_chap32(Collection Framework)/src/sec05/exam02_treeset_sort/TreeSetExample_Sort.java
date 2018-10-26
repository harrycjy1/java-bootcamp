package sec05.exam02_treeset_sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		//저장될때는 무작위로 저장되지만 컬렉션에 들어갈때는 이진트리의 구조를 가지게 됨
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//기본적으로 올림차순으로 정렬
		//디센딩을 두번하면 다시 원래대로 돌아감
		//TreeSet의 descendingSet()은 내림차순으로 정렬된 객체들이 NavigableSEt에 저장된다.
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("내림차순 결과");
		
		for(Integer num : descendingSet) 
			System.out.print(num + " ");
		
			System.out.println("\n객체 수 : "+scores.size());
			System.out.println();
		//다시 descendingSet()을 호출함으로써 올림차순으로 바꿀수도 있다.
		//pollLast(), pollFirst()메서드를 이용해도 된다.
		//(프로그래머가 상황에 맞게끔 선택하면 된다.)
			NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
			System.out.println("올림차순 결과");
			
			for(Integer num : ascendingSet) 
				System.out.print(num + " ");
			
				System.out.println("\n객체 수 : "+scores.size());
				System.out.println();
	}

}
