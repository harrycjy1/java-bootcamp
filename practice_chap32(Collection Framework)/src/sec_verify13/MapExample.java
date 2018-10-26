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
		
		map.put("신은혁", 96);
		map.put("김주성", 86);
		map.put("김연안", 92);
		map.put("김기리", 88);
		map.put("안홍범", 90);
		map.put("박주영", 44);
		map.put("안정환", 55);
		map.put("박성식", 2);
		map.put("윤두호", 9);
		map.put("엄기홍", 12);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		
		System.out.println("종합 학생 수 : "+map.size());
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);

			
			result += value;
		}
		System.out.println("평균 점수 : "+(result/map.size()));

		for(String str : keySet) {
			if(map.get(str)==Collections.max(map.values())) {
				System.out.println("최고 점수 : "+Collections.max(map.values()));
				System.out.println("최고 점수를 받은 아이디 : "+str);
			}
			
			if(map.get(str)==Collections.min(map.values())) {
				System.out.println("최저 점수 : "+Collections.min(map.values()));
				System.out.println("최저 점수를 받은 아이디 : "+str);
			}
		}
	}

}
