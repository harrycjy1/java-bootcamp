package sec_verify01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		int sum =0;
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(5); 
		list.add(4); 
		list.add(-1); 
		list.add(2,-775);
		list.add(3,100);
		
		System.out.println("ArrayList 내의 요소 객체 수 : "+ list.size());
		System.out.println("ArrayList 내의 수를 출력합니다.");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			sum += list.get(i);
		}
		
		System.out.println("ArrayList 내에 있는 정수들의 합 : "+sum);
	}

}
