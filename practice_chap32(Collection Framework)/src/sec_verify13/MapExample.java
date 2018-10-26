package sec_verify13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		int result =0;
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("������", 96);
		map.put("���ּ�", 86);
		map.put("�迬��", 92);
		map.put("��⸮", 88);
		map.put("��ȫ��", 90);
		map.put("���ֿ�", 44);
		map.put("����ȯ", 55);
		map.put("�ڼ���", 2);
		map.put("����ȣ", 9);
		map.put("����ȫ", 12);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		
		System.out.println("���� �л� �� : "+map.size());
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);

			
			result += value;
		}
		System.out.println("��� ���� : "+(result/map.size()));

		for(String str : keySet) {
			if(map.get(str)==Collections.max(map.values())) {
				System.out.println("�ְ� ���� : "+Collections.max(map.values()));
				System.out.println("�ְ� ������ ���� ���̵� : "+str);
			}
			
			if(map.get(str)==Collections.min(map.values())) {
				System.out.println("���� ���� : "+Collections.min(map.values()));
				System.out.println("���� ������ ���� ���̵� : "+str);
			}
		}
	}

}
