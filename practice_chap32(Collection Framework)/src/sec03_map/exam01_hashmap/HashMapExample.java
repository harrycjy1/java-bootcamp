package sec03_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Ű�� String, ���� IntegerŸ�� ���⼭ �Ѵ� ��ü��� �Ϳ� �ָ�����.
		Map<String, Integer> map = new HashMap<String,Integer>();
		/*
		 * map�÷��ǿ� Ű�� ���� �ְ� �ִ�. "ȫ�浿"Ű�� 2�� �ڵ��� �Ǿ��ִµ�,
		 * map�� �ߺ��� Ű�� �������� �ʴ´�. �Ͽ�, �������� put�� �� ������ ��ü�� ���� �ָ�����
		 * ���� ���⼭�� STringŸ���̱� ������ ���� hashcode()�� eqpuals�� ������ ���� �ʾƵ� ��
		 * */
		
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // �ڿ� ���� value������ ���� ����

		//3���� ����
		System.out.println("�� MapEntry�� : "+map.size());
		
		//���ο� ȫ�浿 Ű�� 95��� ������ ��ü
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		//map�÷����� key�� Set���� �ٲ۴�.
		Set<String> keySet = map.keySet();
		//keySET�� ���� �ݺ��� ����
		Iterator<String> keyIterator = keySet.iterator();
		
		
		System.out.println("keySet�� �̿��ؼ� �����.");
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		
		//Ű�� ȫ�浿�� MapEntry�� �����Ѵ�.
		map.remove("ȫ�浿");
		//System.out.println("ȫ�浿 : "+ map.get("ȫ�浿"));
		//2���� �����°��� ���� �ִ�.
		System.out.println("�� MapEntry�� : "+ map.size());
		System.out.println();
		
		//map�÷����� Map.entry��ü�� ������� Set���� �ٲ۴�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		System.out.println("entrySet�̿��ؼ� �����");
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� MapEntry �� : "+map.size());
		
	}

}
