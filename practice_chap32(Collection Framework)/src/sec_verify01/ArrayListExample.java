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
		
		System.out.println("ArrayList ���� ��� ��ü �� : "+ list.size());
		System.out.println("ArrayList ���� ���� ����մϴ�.");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			sum += list.get(i);
		}
		
		System.out.println("ArrayList ���� �ִ� �������� �� : "+sum);
	}

}
