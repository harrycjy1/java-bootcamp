package sec01_list.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		
		//aslist()�� �÷����� �ƴ϶� �迭�������� �� �÷����� �����Ѵ�.
		List<String> list1 = Arrays.asList("ȫ�浿","����ȣ","��⸮");
		
		//�Ʒ��� ���� ��ü �߰�/�����ϸ� ���� �߻�
		//list1.add("dfdf");
		//list1.remove(0);
		
		for(String str : list1)
			System.out.println(str);

		
		System.out.println();
		
		//���� �̷��� �ؾ� ����
		//List<Integer> list2 = Arrays.asList(new Integer(100), new Integer(200), new Integer(300));
		
		List<Integer> list2 = Arrays.asList(100,200,300);
		
		Integer[] arr = (Integer[]) list2.toArray();
		for(int value : arr)
			System.out.println(value);
		
		System.out.println();
		//�ڵ� ��ڽ�
		for(int value : list2)
			System.out.println(value);
	}

}
