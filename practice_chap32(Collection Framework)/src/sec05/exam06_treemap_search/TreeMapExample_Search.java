package sec05.exam06_treemap_search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Search {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		//Map.Entry��ü�� 10�� �������� ����������, ����ɶ��� ����Ʈ�� ��������
		//���ĺ��� �����ڵ忡 ���� �ڵ������� �̷������.
		treemap.put("apple", new Integer(10));
		treemap.put("forever", new Integer(60));
		treemap.put("f", new Integer(64));
		treemap.put("description", new Integer(40));
		treemap.put("ever", new Integer(50));
		treemap.put("zoo", new Integer(100));
		treemap.put("guess", new Integer(80));
		treemap.put("banana", new Integer(90));
		treemap.put("kdb", new Integer(80));
		treemap.put("lherry", new Integer(15));
		
		System.out.println("[c ~ f ������ �ܾ� �˻�]");
		//c ~ f������ Map.Entry��ü�� �������� subMap�� �̿��Ѵ�.
		NavigableMap<String, Integer> rangeMap = treemap.subMap("c",true, "f",true);
		//�ٽ�, rangeMap�� entrySet�� ��� ����غ���.
		
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : "+str +" - ������ : "+value);
		}
		System.out.println();
		
		//"k"�� �����ϰ� ���� ���鸸 ������ Map.Entry��ü�� �����Ѵ�.
		System.out.println("[k ���� ���� �ܾ� �˻�]");
		NavigableMap<String , Integer> tailMap = treemap.tailMap("k",true);
		for(Map.Entry<String , Integer> entry : tailMap.entrySet()) {
		String str = entry.getKey();
		int value = entry.getValue();
		System.out.println("�ܾ� : "+str +" - ������ : "+value);
		}
		System.out.println();
		
		//g�� �����ϰ� �� ������ ���鸸 ������ Map.Entry��ü�� ����
		
		System.out.println("[g ���� ���� �ܾ� �˻�]");
		NavigableMap<String , Integer> headMap = treemap.headMap("k",true);
		for(Map.Entry<String , Integer> entry : headMap.entrySet()) {
		String str = entry.getKey();
		int value = entry.getValue();
		System.out.println("�ܾ� : "+str +" - ������ : "+value);
		}

	}

}
