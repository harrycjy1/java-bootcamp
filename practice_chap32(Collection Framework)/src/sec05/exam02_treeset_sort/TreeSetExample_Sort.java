package sec05.exam02_treeset_sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		//����ɶ��� �������� ��������� �÷��ǿ� ������ ����Ʈ���� ������ ������ ��
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//�⺻������ �ø��������� ����
		//�𼾵��� �ι��ϸ� �ٽ� ������� ���ư�
		//TreeSet�� descendingSet()�� ������������ ���ĵ� ��ü���� NavigableSEt�� ����ȴ�.
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println("�������� ���");
		
		for(Integer num : descendingSet) 
			System.out.print(num + " ");
		
			System.out.println("\n��ü �� : "+scores.size());
			System.out.println();
		//�ٽ� descendingSet()�� ȣ�������ν� �ø��������� �ٲܼ��� �ִ�.
		//pollLast(), pollFirst()�޼��带 �̿��ص� �ȴ�.
		//(���α׷��Ӱ� ��Ȳ�� �°Բ� �����ϸ� �ȴ�.)
			NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
			System.out.println("�ø����� ���");
			
			for(Integer num : ascendingSet) 
				System.out.print(num + " ");
			
				System.out.println("\n��ü �� : "+scores.size());
				System.out.println();
	}

}
