package sec05.exam03_treeset_search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Search {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("����");
		treeSet.add("����");
		treeSet.add("�ٽô�");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		
		
		//c ~ f ���̶�� ���� ������ c�����ؼ� ���� f�κ��� f�� �Ѿ�� �ȵȴٴ� ���� �ǹ��Ѵ�.
		//�ٽø��� f�� ����ϳ� forever ��, orever������ forever�� ����� ���� �ʴ´�
		//�ѱۿ��� ���������̴�.
		
		System.out.println("[c ~ f] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		
		for(String str : rangeSet) 
			System.out.println(str + " ");
		
		System.out.println("[�� ~ ��] ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet1 = treeSet.subSet("��", true, "��", true);
		for(String str : rangeSet1)
			System.out.println(str + " "
					+ "");

	}

}
