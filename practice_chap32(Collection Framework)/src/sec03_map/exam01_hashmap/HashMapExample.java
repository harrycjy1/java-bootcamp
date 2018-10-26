package sec03_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//키가 String, 값이 Integer타입 여기서 둘다 객체라는 것에 주목하자.
		Map<String, Integer> map = new HashMap<String,Integer>();
		/*
		 * map컬렉션에 키와 값을 넣고 있다. "홍길동"키가 2번 코딩이 되어있는데,
		 * map은 중복된 키를 저장하지 않는다. 하여, 마지막에 put이 된 것으로 대체가 됨을 주목하자
		 * 또한 여기서는 STring타입이기 때문에 따로 hashcode()와 eqpuals를 재정의 하지 않아도 됨
		 * */
		
		map.put("신은혁", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 뒤에 넣은 value값으로 덮어 씌움

		//3개가 나옴
		System.out.println("총 MapEntry수 : "+map.size());
		
		//새로운 홍길동 키와 95라는 값으로 대체
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//map컬렉션의 key만 Set으로 바꾼다.
		Set<String> keySet = map.keySet();
		//keySET에 대한 반복자 얻음
		Iterator<String> keyIterator = keySet.iterator();
		
		
		System.out.println("keySet을 이용해서 출력함.");
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		
		//키가 홍길동인 MapEntry를 삭제한다.
		map.remove("홍길동");
		//System.out.println("홍길동 : "+ map.get("홍길동"));
		//2개가 나오는것을 볼수 있다.
		System.out.println("총 MapEntry수 : "+ map.size());
		System.out.println();
		
		//map컬렉션의 Map.entry객체를 대상으로 Set으로 바꾼다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		System.out.println("entrySet이용해서 출력함");
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		
		System.out.println();
		
		//전체 객체 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : "+map.size());
		
	}

}
