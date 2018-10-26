package sec01_list.exam01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {
	
	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//sublist()�� ������ �ε����� �������� �ʰ� listŸ���� ��ȯ�Ѵ�.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		System.out.println("���� ��");
		//list1.sort(c);
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		//list2.add(100);
		//�÷��� ���Կ���(��Ұ� �� ��� �ִٸ� true����)
		System.out.print("list1 �÷��ǿ� list2�÷����� ��� ��Ұ� ����ִ°�? : ");
		System.out.println(list1.containsAll(list2));
		
		System.out.println();
		list2.add("B");
		list2.add("C");
	
		//����
		list2.add(3,"A");
		print(list1,list2);
		//��ü
		list2.set(3, "AA"); //set�� add�ʹ� �ٸ��� ���� ��ü�� �����ϰ� ��
		print(list1,list2);
		
		//list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.(������)
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1,list2);
		
		//list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		
		print(list1,list2);
	}

	
}








