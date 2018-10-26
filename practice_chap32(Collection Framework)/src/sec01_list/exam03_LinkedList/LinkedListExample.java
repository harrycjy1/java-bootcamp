package sec01_list.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		DecimalFormat df = new DecimalFormat("#,###");
		long startTime;
		long endTime;
		
		//startTime = System.nanoTime(); //10의 몇승? -9승  밀리(-3)->마이크로(-6) -> 나노(-9)
		startTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			//ArrayList의 0번째 인덱스에 계속적으로 i를 삽입시킨다.
			//String클래스의 valueOf의 정적메서드를 호출하여 값을 STring화 시킴
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList걸린시간 : "+ df.format(endTime-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		for(int i=0; i<1000000;i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList걸린시간 : "+ df.format(endTime-startTime)+"ms");
		
		//비순차적인 데이터의 추가는 linked가 더 빠름

	}

}
